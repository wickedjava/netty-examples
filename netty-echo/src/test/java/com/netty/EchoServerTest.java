package com.netty;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-12-24
 */
public class EchoServerTest {

	@Test
	public void start() throws Exception {
		EchoServer echoServer = new EchoServer(8080);
		echoServer.start();
		Thread.sleep(30 * 1000);
		echoServer.stop();
	}

}