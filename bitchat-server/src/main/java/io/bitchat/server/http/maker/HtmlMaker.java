package io.bitchat.server.http.maker;

import java.util.Map;

/**
 * html生成器
 *
 * @author houyi
 **/
public interface HtmlMaker {

    /**
     * 根据html模板生成html内容
     *
     * @param htmlTemplate html模板
     * @param contentMap   参数
     * @return html内容
     */
    String make(String htmlTemplate, Map<String, Object> contentMap);


}
