package p458z6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p008a7.AbstractC1282d;
import p060d7.C6400a;
import p315r6.AbstractC12430o;
import p397w6.C13750a;

/* renamed from: z6.d */
/* loaded from: classes7.dex */
public class C14551d implements AbstractC14575x {

    /* renamed from: a */
    private final Context f32983a;

    /* renamed from: b */
    private final AbstractC1282d f32984b;

    /* renamed from: c */
    private final AbstractC14553f f32985c;

    public C14551d(Context context, AbstractC1282d dVar, AbstractC14553f fVar) {
        this.f32983a = context;
        this.f32984b = dVar;
        this.f32985c = fVar;
    }

    /* renamed from: d */
    private boolean m243d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // p458z6.AbstractC14575x
    /* renamed from: a */
    public void mo188a(AbstractC12430o oVar, int i) {
        mo187b(oVar, i, false);
    }

    @Override // p458z6.AbstractC14575x
    /* renamed from: b */
    public void mo187b(AbstractC12430o oVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f32983a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f32983a.getSystemService("jobscheduler");
        int c = m244c(oVar);
        if (z || !m243d(jobScheduler, c, i)) {
            long u = this.f32984b.mo41381u(oVar);
            JobInfo.Builder c2 = this.f32985c.m240c(new JobInfo.Builder(c, componentName), oVar.mo6799d(), u, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", oVar.mo6801b());
            persistableBundle.putInt("priority", C6400a.m25618a(oVar.mo6799d()));
            if (oVar.mo6800c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.mo6800c(), 0));
            }
            c2.setExtras(persistableBundle);
            C13750a.m2813b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c), Long.valueOf(this.f32985c.m236g(oVar.mo6799d(), u, i)), Long.valueOf(u), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C13750a.m2814a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* renamed from: c */
    int m244c(AbstractC12430o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f32983a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.mo6801b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6400a.m25618a(oVar.mo6799d())).array());
        if (oVar.mo6800c() != null) {
            adler32.update(oVar.mo6800c());
        }
        return (int) adler32.getValue();
    }
}
