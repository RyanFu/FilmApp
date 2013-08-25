package com.douban.sdk.android.net;

import java.io.IOException;

import com.douban.sdk.android.DoubanException;


/**
 * 发起访问接口的请求时所需的回调接口
 * @author luopeng (luopeng@staff.sina.com.cn)
 */
public interface DoubanRequestListener {
    /**
     * 用于获取服务器返回的响应内容
     * @param response
     */
	public void onComplete(String response);

	public void onIOException(IOException e);

	public void onError(DoubanException e);

}
