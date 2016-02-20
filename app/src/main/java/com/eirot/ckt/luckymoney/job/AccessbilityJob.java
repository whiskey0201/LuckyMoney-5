package com.eirot.ckt.luckymoney.job;

import android.view.accessibility.AccessibilityEvent;

import com.eirot.ckt.luckymoney.QiangHongBaoService;

public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    boolean isEnable();
}
