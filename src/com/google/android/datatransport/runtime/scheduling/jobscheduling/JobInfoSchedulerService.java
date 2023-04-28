package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p060d7.C6400a;
import p315r6.AbstractC12430o;
import p315r6.C12436t;

/* loaded from: classes7.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30562b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C12436t.m6781f(getApplicationContext());
        AbstractC12430o.AbstractC12431a d = AbstractC12430o.m6802a().mo6795b(string).mo6793d(C6400a.m25617b(i));
        if (string2 != null) {
            d.mo6794c(Base64.decode(string2, 0));
        }
        C12436t.m6784c().m6782e().m200v(d.mo6796a(), i2, new Runnable() { // from class: z6.e
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m30562b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
