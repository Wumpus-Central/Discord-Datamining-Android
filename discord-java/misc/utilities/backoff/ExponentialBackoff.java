package com.discord.misc.utilities.backoff;

import eg.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u0011\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "initialDelay", "", "maxDelay", "maxAttempts", "", "(Lkotlinx/coroutines/CoroutineScope;JJI)V", "currentAttempt", "currentDelay", "job", "Lkotlinx/coroutines/Job;", "cancel", "", "cancelCurrentJob", "fail", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "reset", "succeed", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExponentialBackoff {
    private int currentAttempt = 1;
    private long currentDelay;
    private final long initialDelay;
    private Job job;
    private final int maxAttempts;
    private final long maxDelay;
    private final CoroutineScope scope;

    public ExponentialBackoff(CoroutineScope scope, long j10, long j11, int i10) {
        q.g(scope, "scope");
        this.scope = scope;
        this.initialDelay = j10;
        this.maxDelay = j11;
        this.maxAttempts = i10;
    }

    private final void cancelCurrentJob() {
        Job job = this.job;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    private final void reset() {
        cancelCurrentJob();
        this.currentDelay = 0L;
        this.currentAttempt = 1;
    }

    public final void cancel() {
        reset();
    }

    public final void fail(Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        long j10;
        long h10;
        Job d10;
        q.g(action, "action");
        cancelCurrentJob();
        if (this.currentAttempt <= this.maxAttempts) {
            long j11 = this.currentDelay;
            if (j11 == 0) {
                j10 = j.d(this.initialDelay, 1L);
            } else {
                j10 = j11 * 2;
            }
            h10 = j.h(j10, this.maxDelay);
            this.currentDelay = h10;
            this.currentAttempt++;
            d10 = l.d(this.scope, null, null, new ExponentialBackoff$fail$1(this, action, null), 3, null);
            this.job = d10;
            return;
        }
        throw new MaxAttemptsExceededException();
    }

    public final void succeed() {
        reset();
    }
}
