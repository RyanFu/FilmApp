package com.douban.sdk.android;

import android.os.Bundle;

public interface DoubanAuthListener {

    /**
     * 认证结束后将调用此方法
     * 
     * @param values
     *            Key-value string pairs extracted from the response.
     *            从responsetext中获取的键值对，键值包括"access_token"，"expires_in"，“refresh_token”
     */
    public void onComplete(Bundle values);

    public void onDoubanException(DoubanException e);

    /**
     * Oauth2.0认证过程中，当认证对话框中的webview接收数据出现错误时调用此方法
     */
    public void onError(DoubanDialogError e);

    /**
     * Oauth2.0认证过程中，如果认证窗口被关闭或认证取消时调用
     */
    public void onCancel();

}
