package com.zyk.shejimoshi.Observer;

/**
 * 假设有三个人，小美（女，22），小王和小李。小美很漂亮，小王和小李是两个程序猿，
 * 时刻关注着小美的一举一动。有一天，小美说了一句：“谁来陪我打游戏啊。”这句话被小王和小李听到了，
 * 结果乐坏了，蹭蹭蹭，没一会儿，小王就冲到小美家门口了，在这里，小美是被观察者，小王和小李是观察者，
 * 被观察者发出一条信息，然后观察者们进行相应的处理
 */
public interface Person {
    //小王和小李通过这个接口可以接收到小美发过来的消息
    void getMessage(String s);
}
