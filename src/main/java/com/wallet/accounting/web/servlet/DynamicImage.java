package com.wallet.accounting.web.servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DynamicImage extends HttpServlet {

	private static final long serialVersionUID = 1611669836607820807L;
	private static int WIDTH = 60;
	private static int HEIGHT = 20;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 设置应达类型
		response.setContentType("image/jpeg");
		// 输出流 ,这个是向另外的Serlet输出流
		OutputStream out = response.getOutputStream();

		// 创建一个图片
		BufferedImage bi = new BufferedImage(WIDTH, HEIGHT,
				BufferedImage.TYPE_INT_BGR);
		// 拿到画笔
		Graphics g = bi.getGraphics();
		// 画出背景
		drawBackground(g);
		char c[] = getCode(4);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		// 画出数字
		drawNum(g, c);
		// 结束画图
		g.dispose();

		// 5 图片是在内存中的 Servlet获得输出流获得
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		/*
		 * 通过ImageIO 把画布bi中的内存画 生成一张JPEG图片,把这样图片传给 输出流 输出流就可以给servlte
		 */
		ImageIO.write(bi, "JPEG", bo);

		// 6 servlte获得图片输出流 ---> 在通过servlet中的
		// OutPutStream 输出给客户端
		byte[] b = bo.toByteArray();
		out.write(b);

		// 4 流关闭
		bo.close();
		out.flush();

	}

	/**
	 * @param int 传一个你需的码的长度
	 * @return 返回一个随时生成的一个字符数组，长度为你传的
	 */
	private char[] getCode(int size) {
		String str = "0123456789";
		char[] c = new char[size];
		for (int i = 0; i < c.length; i++) {
			int k = (int) (Math.random() * 10);
			c[i] = str.charAt(k);
		}
		return c;
	}

	/**
	 * 画动态图片的背景
	 * 
	 * @param g
	 *            +
	 * 
	 * 
	 *            @
	 */
	private void drawBackground(Graphics g) {
		g.setColor(Color.lightGray);
		// g.drawRect(0, 0, WIDTH, HEIGHT);
		// g.draw3DRect(0, 0, WIDTH, HEIGHT, true);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}

	/**
	 * 画图片的数字
	 */
	private void drawNum(Graphics g, char[] c) {
		g.setColor(Color.RED);
		g.drawString("" + c[0], 2, 17);
		g.drawString("" + c[1], 16, 15);
		g.drawString("" + c[2], 32, 18);
		g.drawString("" + c[3], 48, 16);
	}
}
