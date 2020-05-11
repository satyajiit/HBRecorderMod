package com.argonlabs.hbrecordermod;

public interface HBRecorderListener {
    void HBRecorderOnComplete();
    void HBRecorderOnError(int errorCode, String reason);
}
