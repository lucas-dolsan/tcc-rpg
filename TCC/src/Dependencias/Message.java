package Dependencias;

import java.io.Serializable;

public class Message implements Serializable {

    private long chId; //-1 means from client to server, otherwise chId generated by the server
    private long timestamp, //-1 means from client to server, otherwise timeStamp of the moment when the server receives the message
            ttl = 2000; //2 seconds TTL
    private Object data; //can carry any type of object. in this program, i used a sound packet, but it could be a string, a chunk of video, ...

    public Message(long chId, long timestamp, Object data) {
        this.chId = chId;
        this.timestamp = timestamp;
        this.data = data;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getChId() {
        return chId;
    }

    public Object getData() {
        return data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public void setChId(long chId) {
        this.chId = chId;
    }

}
