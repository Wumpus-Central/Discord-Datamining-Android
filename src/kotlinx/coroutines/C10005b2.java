package kotlinx.coroutines;

import androidx.concurrent.futures.C2113b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9937j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.AbstractC10127y;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10109o;
import kotlinx.coroutines.internal.C10110p;
import kotlinx.coroutines.selects.AbstractC10198d;
import nf.C11067f;
import p306qi.AbstractC12188i;
import p306qi.C12190k;
import p429xi.C14169a;
import p429xi.C14170b;

@Metadata(m15074d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¬\u0001\u0099\u0001B\u0012\u0012\u0007\u0010©\u0001\u001a\u00020\u0015¢\u0006\u0006\bª\u0001\u0010«\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u00106J\u0019\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010DJ*\u0010F\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010E\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010H\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u0004\u0018\u00010B*\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020N2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0015¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0010H\u0014¢\u0006\u0004\bV\u0010WJ\u0011\u0010Z\u001a\u00060Xj\u0002`Y¢\u0006\u0004\bZ\u0010[J#\u0010]\u001a\u00060Xj\u0002`Y*\u00020\u000b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010NH\u0004¢\u0006\u0004\b]\u0010^J'\u0010`\u001a\u00020_2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\b`\u0010aJ7\u0010c\u001a\u00020_2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\be\u00104J\u001f\u0010f\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010Xj\u0004\u0018\u0001`YH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020NH\u0014¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u0003¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010 J\u0017\u0010p\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bp\u0010 J\u0019\u0010q\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bq\u0010rJ\u0013\u0010s\u001a\u00060Xj\u0002`YH\u0016¢\u0006\u0004\bs\u0010[J\u001b\u0010t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bt\u00106J\u0015\u0010v\u001a\u00020u2\u0006\u0010E\u001a\u00020\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00102\u0006\u0010x\u001a\u00020\u000bH\u0010¢\u0006\u0004\by\u0010kJ\u0019\u0010z\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\bz\u0010kJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u000bH\u0014¢\u0006\u0004\b{\u0010 J\u0019\u0010|\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b~\u0010}J\u000f\u0010\u007f\u001a\u00020NH\u0016¢\u0006\u0004\b\u007f\u0010iJ\u0011\u0010\u0080\u0001\u001a\u00020NH\u0007¢\u0006\u0005\b\u0080\u0001\u0010iJ\u0011\u0010\u0081\u0001\u001a\u00020NH\u0010¢\u0006\u0005\b\u0081\u0001\u0010iJ\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JX\u0010\u0089\u0001\u001a\u00020\u0010\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u001072\u000e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0084\u00012%\u0010\u0088\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0087\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0086\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JX\u0010\u008b\u0001\u001a\u00020\u0010\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u001072\u000e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0084\u00012%\u0010\u0088\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0087\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0086\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001e\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u00108R\u0019\u0010\u0091\u0001\u001a\u0007\u0012\u0002\b\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R.\u0010\u0097\u0001\u001a\u0004\u0018\u00010u2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010u8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0083\u0001R\u0016\u0010\u009a\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010UR\u0013\u0010\u009c\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010UR\u0013\u0010\u009e\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010UR\u0016\u0010 \u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010UR\u001b\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010¦\u0001\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010UR\u0016\u0010¨\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u00ad\u0001"}, m15073d2 = {"Lkotlinx/coroutines/b2;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/j2;", "", "Lkotlinx/coroutines/b2$b;", "state", "proposedUpdate", "T", "(Lkotlinx/coroutines/b2$b;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "Z", "(Lkotlinx/coroutines/b2$b;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "E", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/p1;", "update", "", "L0", "(Lkotlinx/coroutines/p1;Ljava/lang/Object;)Z", "O", "(Lkotlinx/coroutines/p1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/g2;", "list", "cause", "s0", "(Lkotlinx/coroutines/g2;Ljava/lang/Throwable;)V", "L", "(Ljava/lang/Throwable;)Z", "t0", "", "G0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lkotlinx/coroutines/a2;", "p0", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/a2;", "expect", "node", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/g2;Lkotlinx/coroutines/a2;)Z", "Lkotlinx/coroutines/d1;", "y0", "(Lkotlinx/coroutines/d1;)V", "A0", "(Lkotlinx/coroutines/a2;)V", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "n0", "d0", "(Lkotlinx/coroutines/p1;)Lkotlinx/coroutines/g2;", "M0", "(Lkotlinx/coroutines/p1;Ljava/lang/Throwable;)Z", "N0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "O0", "(Lkotlinx/coroutines/p1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/v;", "V", "(Lkotlinx/coroutines/p1;)Lkotlinx/coroutines/v;", "child", "P0", "(Lkotlinx/coroutines/b2$b;Lkotlinx/coroutines/v;Ljava/lang/Object;)Z", "lastChild", "P", "(Lkotlinx/coroutines/b2$b;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/p;", "r0", "(Lkotlinx/coroutines/internal/p;)Lkotlinx/coroutines/v;", "", "H0", "(Ljava/lang/Object;)Ljava/lang/String;", "parent", "k0", "(Lkotlinx/coroutines/Job;)V", ViewProps.START, "()Z", "x0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "C", "()Ljava/util/concurrent/CancellationException;", "message", "I0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/a1;", "Q", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/a1;", "invokeImmediately", "z", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/a1;", "C0", "h", "(Ljava/util/concurrent/CancellationException;)V", "M", "()Ljava/lang/String;", "J", "(Ljava/lang/Throwable;)V", "parentJob", "H", "(Lkotlinx/coroutines/j2;)V", "N", "G", "I", "(Ljava/lang/Object;)Z", "Y", "o0", "Lkotlinx/coroutines/u;", "F0", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "exception", "i0", "u0", "h0", "v0", "(Ljava/lang/Object;)V", "F", "toString", "K0", "q0", "W", "()Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "B0", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "D0", "X", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "value", "e0", "()Lkotlinx/coroutines/u;", "E0", "(Lkotlinx/coroutines/u;)V", "parentHandle", "g0", "b", "isActive", "g", "isCompleted", "l0", "isCancelled", "c0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "s", "()Lkotlin/sequences/Sequence;", "children", "m0", "isScopedCoroutine", "a0", "handlesException", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Z)V", "a", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b2 */
/* loaded from: classes8.dex */
public class C10005b2 implements Job, AbstractC10221w, AbstractC10133j2 {

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22127k = AtomicReferenceFieldUpdater.newUpdater(C10005b2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lkotlinx/coroutines/b2$a;", "Lkotlinx/coroutines/a2;", "", "cause", "", "W", "Lkotlinx/coroutines/b2;", "o", "Lkotlinx/coroutines/b2;", "parent", "Lkotlinx/coroutines/b2$b;", "p", "Lkotlinx/coroutines/b2$b;", "state", "Lkotlinx/coroutines/v;", "q", "Lkotlinx/coroutines/v;", "child", "", "r", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/b2;Lkotlinx/coroutines/b2$b;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.b2$a */
    /* loaded from: classes8.dex */
    public static final class C10006a extends AbstractC10001a2 {

        /* renamed from: o */
        private final C10005b2 f22128o;

        /* renamed from: p */
        private final C10007b f22129p;

        /* renamed from: q */
        private final C10217v f22130q;

        /* renamed from: r */
        private final Object f22131r;

        public C10006a(C10005b2 b2Var, C10007b bVar, C10217v vVar, Object obj) {
            this.f22128o = b2Var;
            this.f22129p = bVar;
            this.f22130q = vVar;
            this.f22131r = obj;
        }

        @Override // kotlinx.coroutines.AbstractC10003b0
        /* renamed from: W */
        public void mo13984W(Throwable th2) {
            this.f22128o.m14537P(this.f22129p, this.f22130q, this.f22131r);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo13984W(th2);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b\u0015\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0011\u0010,\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0014\u0010.\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"¨\u00061"}, m15073d2 = {"Lkotlinx/coroutines/b2$b;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/p1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/g2;", "k", "Lkotlinx/coroutines/g2;", "d", "()Lkotlinx/coroutines/g2;", "list", "value", "e", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "h", "()Z", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", "m", "rootCause", "i", "isSealed", "g", "isCancelling", "b", "isActive", "<init>", "(Lkotlinx/coroutines/g2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.b2$b */
    /* loaded from: classes8.dex */
    public static final class C10007b implements AbstractC10158p1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: k */
        private final C10071g2 f22132k;

        public C10007b(C10071g2 g2Var, boolean z, Throwable th2) {
            this.f22132k = g2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m14508c() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m14507e() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m14500l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m14509a(Throwable th2) {
            Throwable f = m14506f();
            if (f == null) {
                m14499m(th2);
            } else if (th2 != f) {
                Object e = m14507e();
                if (e == null) {
                    m14500l(th2);
                } else if (e instanceof Throwable) {
                    if (th2 != e) {
                        ArrayList<Throwable> c = m14508c();
                        c.add(e);
                        c.add(th2);
                        m14500l(c);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + e).toString());
                }
            }
        }

        @Override // kotlinx.coroutines.AbstractC10158p1
        /* renamed from: b */
        public boolean mo14113b() {
            return m14506f() == null;
        }

        @Override // kotlinx.coroutines.AbstractC10158p1
        /* renamed from: d */
        public C10071g2 mo14112d() {
            return this.f22132k;
        }

        /* renamed from: f */
        public final Throwable m14506f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m14505g() {
            return m14506f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean m14504h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m14503i() {
            C10087d0 d0Var;
            Object e = m14507e();
            d0Var = C10013c2.f22145e;
            return e == d0Var;
        }

        /* renamed from: j */
        public final List<Throwable> m14502j(Throwable th2) {
            ArrayList<Throwable> arrayList;
            C10087d0 d0Var;
            Object e = m14507e();
            if (e == null) {
                arrayList = m14508c();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> c = m14508c();
                c.add(e);
                arrayList = c;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(("State is " + e).toString());
            }
            Throwable f = m14506f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th2 != null && !C9971q.m14638b(th2, f)) {
                arrayList.add(th2);
            }
            d0Var = C10013c2.f22145e;
            m14500l(d0Var);
            return arrayList;
        }

        /* renamed from: k */
        public final void m14501k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void m14499m(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + m14505g() + ", completing=" + m14504h() + ", rootCause=" + m14506f() + ", exceptions=" + m14507e() + ", list=" + mo14112d() + ']';
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m15073d2 = {"kotlinx/coroutines/b2$c", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.b2$c */
    /* loaded from: classes8.dex */
    public static final class C10008c extends C10110p.AbstractC10112b {

        /* renamed from: d */
        final /* synthetic */ C10005b2 f22133d;

        /* renamed from: e */
        final /* synthetic */ Object f22134e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10008c(C10110p pVar, C10005b2 b2Var, Object obj) {
            super(pVar);
            this.f22133d = b2Var;
            this.f22134e = obj;
        }

        /* renamed from: k */
        public Object mo3922i(C10110p pVar) {
            if (this.f22133d.m14525g0() == this.f22134e) {
                return null;
            }
            return C10109o.m14265a();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m15073d2 = {"Lqi/i;", "Lkotlinx/coroutines/Job;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.JobSupport$children$1", m14701f = "JobSupport.kt", m14700l = {952, 954}, m14699m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.b2$d */
    /* loaded from: classes8.dex */
    static final class C10009d extends AbstractC9937j implements Function2<AbstractC12188i<? super Job>, Continuation<? super Unit>, Object> {

        /* renamed from: l */
        Object f22135l;

        /* renamed from: m */
        Object f22136m;

        /* renamed from: n */
        int f22137n;

        /* renamed from: o */
        private /* synthetic */ Object f22138o;

        C10009d(Continuation<? super C10009d> continuation) {
            super(2, continuation);
        }

        /* renamed from: a */
        public final Object invoke(AbstractC12188i<? super Job> iVar, Continuation<? super Unit> continuation) {
            return ((C10009d) create(iVar, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10009d dVar = new C10009d(continuation);
            dVar.f22138o = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = tf.C13075b.m4650d()
                int r1 = r7.f22137n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r7.f22136m
                kotlinx.coroutines.internal.p r1 = (kotlinx.coroutines.internal.C10110p) r1
                java.lang.Object r3 = r7.f22135l
                kotlinx.coroutines.internal.n r3 = (kotlinx.coroutines.internal.C10108n) r3
                java.lang.Object r4 = r7.f22138o
                qi.i r4 = (p306qi.AbstractC12188i) r4
                nf.C11093t.m10930b(r8)
                r8 = r7
                goto L_0x007e
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                nf.C11093t.m10930b(r8)
                goto L_0x0083
            L_0x002b:
                nf.C11093t.m10930b(r8)
                java.lang.Object r8 = r7.f22138o
                qi.i r8 = (p306qi.AbstractC12188i) r8
                kotlinx.coroutines.b2 r1 = kotlinx.coroutines.C10005b2.this
                java.lang.Object r1 = r1.m14525g0()
                boolean r4 = r1 instanceof kotlinx.coroutines.C10217v
                if (r4 == 0) goto L_0x0049
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.C10217v) r1
                kotlinx.coroutines.w r1 = r1.f22469o
                r7.f22137n = r3
                java.lang.Object r8 = r8.mo7479d(r1, r7)
                if (r8 != r0) goto L_0x0083
                return r0
            L_0x0049:
                boolean r3 = r1 instanceof kotlinx.coroutines.AbstractC10158p1
                if (r3 == 0) goto L_0x0083
                kotlinx.coroutines.p1 r1 = (kotlinx.coroutines.AbstractC10158p1) r1
                kotlinx.coroutines.g2 r1 = r1.mo14112d()
                if (r1 == 0) goto L_0x0083
                java.lang.Object r3 = r1.m14253L()
                kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.C10110p) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x0060:
                boolean r5 = kotlin.jvm.internal.C9971q.m14638b(r1, r3)
                if (r5 != 0) goto L_0x0083
                boolean r5 = r1 instanceof kotlinx.coroutines.C10217v
                if (r5 == 0) goto L_0x007e
                r5 = r1
                kotlinx.coroutines.v r5 = (kotlinx.coroutines.C10217v) r5
                kotlinx.coroutines.w r5 = r5.f22469o
                r8.f22138o = r4
                r8.f22135l = r3
                r8.f22136m = r1
                r8.f22137n = r2
                java.lang.Object r5 = r4.mo7479d(r5, r8)
                if (r5 != r0) goto L_0x007e
                return r0
            L_0x007e:
                kotlinx.coroutines.internal.p r1 = r1.m14252M()
                goto L_0x0060
            L_0x0083:
                kotlin.Unit r8 = kotlin.Unit.f22042a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10005b2.C10009d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C10005b2(boolean z) {
        C10016d1 d1Var;
        if (z) {
            d1Var = C10013c2.f22147g;
        } else {
            d1Var = C10013c2.f22146f;
        }
        this._state = d1Var;
        this._parentHandle = null;
    }

    /* renamed from: A0 */
    private final void m14561A0(AbstractC10001a2 a2Var) {
        a2Var.m14257H(new C10071g2());
        C2113b.m38965a(f22127k, this, a2Var, a2Var.m14252M());
    }

    /* renamed from: D */
    private final boolean m14557D(Object obj, C10071g2 g2Var, AbstractC10001a2 a2Var) {
        int V;
        C10008c cVar = new C10008c(a2Var, this, obj);
        do {
            V = g2Var.m14251N().m14244V(a2Var, g2Var, cVar);
            if (V == 1) {
                return true;
            }
        } while (V != 2);
        return false;
    }

    /* renamed from: E */
    private final void m14555E(Throwable th2, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th3 : list) {
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    C11067f.m10981a(th2, th3);
                }
            }
        }
    }

    /* renamed from: G0 */
    private final int m14551G0(Object obj) {
        C10016d1 d1Var;
        if (obj instanceof C10016d1) {
            if (((C10016d1) obj).mo14113b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22127k;
            d1Var = C10013c2.f22147g;
            if (!C2113b.m38965a(atomicReferenceFieldUpdater, this, obj, d1Var)) {
                return -1;
            }
            mo14464x0();
            return 1;
        } else if (!(obj instanceof C10154o1)) {
            return 0;
        } else {
            if (!C2113b.m38965a(f22127k, this, obj, ((C10154o1) obj).mo14112d())) {
                return -1;
            }
            mo14464x0();
            return 1;
        }
    }

    /* renamed from: H0 */
    private final String m14550H0(Object obj) {
        if (obj instanceof C10007b) {
            C10007b bVar = (C10007b) obj;
            if (bVar.m14505g()) {
                return "Cancelling";
            }
            if (bVar.m14504h()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof AbstractC10158p1) {
            if (((AbstractC10158p1) obj).mo14113b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C10234z) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: J0 */
    public static /* synthetic */ CancellationException m14547J0(C10005b2 b2Var, Throwable th2, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return b2Var.m14548I0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: K */
    private final Object m14546K(Object obj) {
        C10087d0 d0Var;
        Object N0;
        C10087d0 d0Var2;
        do {
            Object g0 = m14525g0();
            if (!(g0 instanceof AbstractC10158p1) || ((g0 instanceof C10007b) && ((C10007b) g0).m14504h())) {
                d0Var = C10013c2.f22141a;
                return d0Var;
            }
            N0 = m14540N0(g0, new C10234z(m14534R(obj), false, 2, null));
            d0Var2 = C10013c2.f22143c;
        } while (N0 == d0Var2);
        return N0;
    }

    /* renamed from: L */
    private final boolean m14544L(Throwable th2) {
        if (mo14335m0()) {
            return true;
        }
        boolean z = th2 instanceof CancellationException;
        AbstractC10213u e0 = m14527e0();
        if (e0 == null || e0 == C10075h2.f22261k) {
            return z;
        }
        if (e0.mo13983c(th2) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: L0 */
    private final boolean m14543L0(AbstractC10158p1 p1Var, Object obj) {
        if (!C2113b.m38965a(f22127k, this, p1Var, C10013c2.m14489g(obj))) {
            return false;
        }
        m14514u0(null);
        mo14513v0(obj);
        m14539O(p1Var, obj);
        return true;
    }

    /* renamed from: M0 */
    private final boolean m14541M0(AbstractC10158p1 p1Var, Throwable th2) {
        C10071g2 d0 = m14528d0(p1Var);
        if (d0 == null) {
            return false;
        }
        if (!C2113b.m38965a(f22127k, this, p1Var, new C10007b(d0, false, th2))) {
            return false;
        }
        m14516s0(d0, th2);
        return true;
    }

    /* renamed from: N0 */
    private final Object m14540N0(Object obj, Object obj2) {
        C10087d0 d0Var;
        C10087d0 d0Var2;
        if (!(obj instanceof AbstractC10158p1)) {
            d0Var2 = C10013c2.f22141a;
            return d0Var2;
        } else if ((!(obj instanceof C10016d1) && !(obj instanceof AbstractC10001a2)) || (obj instanceof C10217v) || (obj2 instanceof C10234z)) {
            return m14538O0((AbstractC10158p1) obj, obj2);
        } else {
            if (m14543L0((AbstractC10158p1) obj, obj2)) {
                return obj2;
            }
            d0Var = C10013c2.f22143c;
            return d0Var;
        }
    }

    /* renamed from: O */
    private final void m14539O(AbstractC10158p1 p1Var, Object obj) {
        C10234z zVar;
        AbstractC10213u e0 = m14527e0();
        if (e0 != null) {
            e0.dispose();
            m14554E0(C10075h2.f22261k);
        }
        Throwable th2 = null;
        if (obj instanceof C10234z) {
            zVar = (C10234z) obj;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            th2 = zVar.f22488a;
        }
        if (p1Var instanceof AbstractC10001a2) {
            try {
                ((AbstractC10001a2) p1Var).mo13984W(th2);
            } catch (Throwable th3) {
                mo14524i0(new C10011c0("Exception in completion handler " + p1Var + " for " + this, th3));
            }
        } else {
            C10071g2 d = p1Var.mo14112d();
            if (d != null) {
                m14515t0(d, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m14538O0(kotlinx.coroutines.AbstractC10158p1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            kotlinx.coroutines.g2 r0 = r8.m14528d0(r9)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.d0 r9 = kotlinx.coroutines.C10013c2.m14494b()
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof kotlinx.coroutines.C10005b2.C10007b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            kotlinx.coroutines.b2$b r1 = (kotlinx.coroutines.C10005b2.C10007b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.b2$b r1 = new kotlinx.coroutines.b2$b
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.m14504h()     // Catch: all -> 0x0087
            if (r5 == 0) goto L_0x002f
            kotlinx.coroutines.internal.d0 r9 = kotlinx.coroutines.C10013c2.m14495a()     // Catch: all -> 0x0087
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.m14501k(r5)     // Catch: all -> 0x0087
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.C10005b2.f22127k     // Catch: all -> 0x0087
            boolean r6 = androidx.concurrent.futures.C2113b.m38965a(r6, r8, r9, r1)     // Catch: all -> 0x0087
            if (r6 != 0) goto L_0x0043
            kotlinx.coroutines.internal.d0 r9 = kotlinx.coroutines.C10013c2.m14494b()     // Catch: all -> 0x0087
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.m14505g()     // Catch: all -> 0x0087
            boolean r7 = r10 instanceof kotlinx.coroutines.C10234z     // Catch: all -> 0x0087
            if (r7 == 0) goto L_0x004f
            r7 = r10
            kotlinx.coroutines.z r7 = (kotlinx.coroutines.C10234z) r7     // Catch: all -> 0x0087
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f22488a     // Catch: all -> 0x0087
            r1.m14509a(r7)     // Catch: all -> 0x0087
        L_0x0057:
            java.lang.Throwable r7 = r1.m14506f()     // Catch: all -> 0x0087
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: all -> 0x0087
            boolean r3 = r3.booleanValue()     // Catch: all -> 0x0087
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.f22069k = r2     // Catch: all -> 0x0087
            kotlin.Unit r3 = kotlin.Unit.f22042a     // Catch: all -> 0x0087
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0073
            r8.m14516s0(r0, r2)
        L_0x0073:
            kotlinx.coroutines.v r9 = r8.m14532V(r9)
            if (r9 == 0) goto L_0x0082
            boolean r9 = r8.m14536P0(r1, r9, r10)
            if (r9 == 0) goto L_0x0082
            kotlinx.coroutines.internal.d0 r9 = kotlinx.coroutines.C10013c2.f22142b
            return r9
        L_0x0082:
            java.lang.Object r9 = r8.m14533T(r1, r10)
            return r9
        L_0x0087:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10005b2.m14538O0(kotlinx.coroutines.p1, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m14537P(C10007b bVar, C10217v vVar, Object obj) {
        C10217v r0 = m14518r0(vVar);
        if (r0 == null || !m14536P0(bVar, r0, obj)) {
            mo13982F(m14533T(bVar, obj));
        }
    }

    /* renamed from: P0 */
    private final boolean m14536P0(C10007b bVar, C10217v vVar, Object obj) {
        while (Job.C9996a.m14568d(vVar.f22469o, false, false, new C10006a(this, bVar, vVar, obj), 1, null) == C10075h2.f22261k) {
            vVar = m14518r0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    private final Throwable m14534R(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new C10215u1(mo14542M(), null, this);
            }
            return th2;
        } else if (obj != null) {
            return ((AbstractC10133j2) obj).mo14190Y();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: T */
    private final Object m14533T(C10007b bVar, Object obj) {
        C10234z zVar;
        Throwable th2;
        boolean g;
        Throwable Z;
        if (obj instanceof C10234z) {
            zVar = (C10234z) obj;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            th2 = zVar.f22488a;
        } else {
            th2 = null;
        }
        synchronized (bVar) {
            g = bVar.m14505g();
            List<Throwable> j = bVar.m14502j(th2);
            Z = m14529Z(bVar, j);
            if (Z != null) {
                m14555E(Z, j);
            }
        }
        boolean z = false;
        if (!(Z == null || Z == th2)) {
            obj = new C10234z(Z, false, 2, null);
        }
        if (Z != null) {
            if (m14544L(Z) || mo14162h0(Z)) {
                z = true;
            }
            if (z) {
                if (obj != null) {
                    ((C10234z) obj).m13942b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!g) {
            m14514u0(Z);
        }
        mo14513v0(obj);
        C2113b.m38965a(f22127k, this, bVar, C10013c2.m14489g(obj));
        m14539O(bVar, obj);
        return obj;
    }

    /* renamed from: V */
    private final C10217v m14532V(AbstractC10158p1 p1Var) {
        C10217v vVar = p1Var instanceof C10217v ? (C10217v) p1Var : null;
        if (vVar != null) {
            return vVar;
        }
        C10071g2 d = p1Var.mo14112d();
        if (d != null) {
            return m14518r0(d);
        }
        return null;
    }

    /* renamed from: X */
    private final Throwable m14530X(Object obj) {
        C10234z zVar = obj instanceof C10234z ? (C10234z) obj : null;
        if (zVar != null) {
            return zVar.f22488a;
        }
        return null;
    }

    /* renamed from: Z */
    private final Throwable m14529Z(C10007b bVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th2 = (Throwable) obj;
            if (th2 != null) {
                return th2;
            }
            Throwable th3 = (Throwable) list.get(0);
            if (th3 instanceof C10172s2) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Throwable th4 = (Throwable) next;
                    if (th4 == th3 || !(th4 instanceof C10172s2)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj2 = next;
                        break;
                    }
                }
                Throwable th5 = (Throwable) obj2;
                if (th5 != null) {
                    return th5;
                }
            }
            return th3;
        } else if (bVar.m14505g()) {
            return new C10215u1(mo14542M(), null, this);
        } else {
            return null;
        }
    }

    /* renamed from: d0 */
    private final C10071g2 m14528d0(AbstractC10158p1 p1Var) {
        C10071g2 d = p1Var.mo14112d();
        if (d != null) {
            return d;
        }
        if (p1Var instanceof C10016d1) {
            return new C10071g2();
        }
        if (p1Var instanceof AbstractC10001a2) {
            m14561A0((AbstractC10001a2) p1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + p1Var).toString());
    }

    /* renamed from: n0 */
    private final Object m14521n0(Object obj) {
        C10087d0 d0Var;
        C10087d0 d0Var2;
        C10087d0 d0Var3;
        C10087d0 d0Var4;
        C10087d0 d0Var5;
        C10087d0 d0Var6;
        Throwable th2 = null;
        Throwable th3 = null;
        while (true) {
            Object g0 = m14525g0();
            if (g0 instanceof C10007b) {
                synchronized (g0) {
                    if (((C10007b) g0).m14503i()) {
                        d0Var2 = C10013c2.f22144d;
                        return d0Var2;
                    }
                    boolean g = ((C10007b) g0).m14505g();
                    if (obj != null || !g) {
                        if (th3 == null) {
                            th3 = m14534R(obj);
                        }
                        ((C10007b) g0).m14509a(th3);
                    }
                    Throwable f = ((C10007b) g0).m14506f();
                    if (!g) {
                        th2 = f;
                    }
                    if (th2 != null) {
                        m14516s0(((C10007b) g0).mo14112d(), th2);
                    }
                    d0Var = C10013c2.f22141a;
                    return d0Var;
                }
            } else if (g0 instanceof AbstractC10158p1) {
                if (th3 == null) {
                    th3 = m14534R(obj);
                }
                AbstractC10158p1 p1Var = (AbstractC10158p1) g0;
                if (!p1Var.mo14113b()) {
                    Object N0 = m14540N0(g0, new C10234z(th3, false, 2, null));
                    d0Var5 = C10013c2.f22141a;
                    if (N0 != d0Var5) {
                        d0Var6 = C10013c2.f22143c;
                        if (N0 != d0Var6) {
                            return N0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + g0).toString());
                    }
                } else if (m14541M0(p1Var, th3)) {
                    d0Var4 = C10013c2.f22141a;
                    return d0Var4;
                }
            } else {
                d0Var3 = C10013c2.f22144d;
                return d0Var3;
            }
        }
    }

    /* renamed from: p0 */
    private final AbstractC10001a2 m14519p0(Function1<? super Throwable, Unit> function1, boolean z) {
        AbstractC10001a2 a2Var = null;
        if (z) {
            if (function1 instanceof AbstractC10219v1) {
                a2Var = (AbstractC10219v1) function1;
            }
            if (a2Var == null) {
                a2Var = new C10171s1(function1);
            }
        } else {
            if (function1 instanceof AbstractC10001a2) {
                a2Var = (AbstractC10001a2) function1;
            }
            if (a2Var == null) {
                a2Var = new C10211t1(function1);
            }
        }
        a2Var.m14563Y(this);
        return a2Var;
    }

    /* renamed from: r0 */
    private final C10217v m14518r0(C10110p pVar) {
        while (pVar.mo14248Q()) {
            pVar = pVar.m14251N();
        }
        while (true) {
            pVar = pVar.m14252M();
            if (!pVar.mo14248Q()) {
                if (pVar instanceof C10217v) {
                    return (C10217v) pVar;
                }
                if (pVar instanceof C10071g2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: s0 */
    private final void m14516s0(C10071g2 g2Var, Throwable th2) {
        m14514u0(th2);
        C10011c0 c0Var = null;
        for (C10110p pVar = (C10110p) g2Var.m14253L(); !C9971q.m14638b(pVar, g2Var); pVar = pVar.m14252M()) {
            if (pVar instanceof AbstractC10219v1) {
                AbstractC10001a2 a2Var = (AbstractC10001a2) pVar;
                try {
                    a2Var.mo13984W(th2);
                } catch (Throwable th3) {
                    if (c0Var != null) {
                        C11067f.m10981a(c0Var, th3);
                    } else {
                        c0Var = new C10011c0("Exception in completion handler " + a2Var + " for " + this, th3);
                        Unit unit = Unit.f22042a;
                    }
                }
            }
        }
        if (c0Var != null) {
            mo14524i0(c0Var);
        }
        m14544L(th2);
    }

    /* renamed from: t0 */
    private final void m14515t0(C10071g2 g2Var, Throwable th2) {
        C10011c0 c0Var = null;
        for (C10110p pVar = (C10110p) g2Var.m14253L(); !C9971q.m14638b(pVar, g2Var); pVar = pVar.m14252M()) {
            if (pVar instanceof AbstractC10001a2) {
                AbstractC10001a2 a2Var = (AbstractC10001a2) pVar;
                try {
                    a2Var.mo13984W(th2);
                } catch (Throwable th3) {
                    if (c0Var != null) {
                        C11067f.m10981a(c0Var, th3);
                    } else {
                        c0Var = new C10011c0("Exception in completion handler " + a2Var + " for " + this, th3);
                        Unit unit = Unit.f22042a;
                    }
                }
            }
        }
        if (c0Var != null) {
            mo14524i0(c0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.o1] */
    /* renamed from: y0 */
    private final void m14511y0(C10016d1 d1Var) {
        C10071g2 g2Var = new C10071g2();
        if (!d1Var.mo14113b()) {
            g2Var = new C10154o1(g2Var);
        }
        C2113b.m38965a(f22127k, this, d1Var, g2Var);
    }

    /* renamed from: B0 */
    public final <T, R> void m14560B0(AbstractC10198d<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object g0;
        do {
            g0 = m14525g0();
            if (!dVar.mo14022e()) {
                if (!(g0 instanceof AbstractC10158p1)) {
                    if (!dVar.mo14019s()) {
                        return;
                    }
                    if (g0 instanceof C10234z) {
                        dVar.mo14017x(((C10234z) g0).f22488a);
                        return;
                    } else {
                        C14170b.m1464c(function2, C10013c2.m14488h(g0), dVar.mo14018w());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (m14551G0(g0) != 0);
        dVar.mo14021n(mo14535Q(new C10147m2(dVar, function2)));
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: C */
    public final CancellationException mo14559C() {
        Object g0 = m14525g0();
        if (g0 instanceof C10007b) {
            Throwable f = ((C10007b) g0).m14506f();
            if (f != null) {
                CancellationException I0 = m14548I0(f, C10149n0.m14165a(this) + " is cancelling");
                if (I0 != null) {
                    return I0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (g0 instanceof AbstractC10158p1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (g0 instanceof C10234z) {
            return m14547J0(this, ((C10234z) g0).f22488a, null, 1, null);
        } else {
            return new C10215u1(C10149n0.m14165a(this) + " has completed normally", null, this);
        }
    }

    /* renamed from: C0 */
    public final void m14558C0(AbstractC10001a2 a2Var) {
        Object g0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C10016d1 d1Var;
        do {
            g0 = m14525g0();
            if (g0 instanceof AbstractC10001a2) {
                if (g0 == a2Var) {
                    atomicReferenceFieldUpdater = f22127k;
                    d1Var = C10013c2.f22147g;
                } else {
                    return;
                }
            } else if ((g0 instanceof AbstractC10158p1) && ((AbstractC10158p1) g0).mo14112d() != null) {
                a2Var.mo3849R();
                return;
            } else {
                return;
            }
        } while (!C2113b.m38965a(atomicReferenceFieldUpdater, this, g0, d1Var));
    }

    /* renamed from: D0 */
    public final <T, R> void m14556D0(AbstractC10198d<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object g0 = m14525g0();
        if (g0 instanceof C10234z) {
            dVar.mo14017x(((C10234z) g0).f22488a);
        } else {
            C14169a.m1467e(function2, C10013c2.m14488h(g0), dVar.mo14018w(), null, 4, null);
        }
    }

    /* renamed from: E0 */
    public final void m14554E0(AbstractC10213u uVar) {
        this._parentHandle = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo13982F(Object obj) {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: F0 */
    public final AbstractC10213u mo14553F0(AbstractC10221w wVar) {
        return (AbstractC10213u) Job.C9996a.m14568d(this, true, false, new C10217v(wVar), 2, null);
    }

    /* renamed from: G */
    public final boolean m14552G(Throwable th2) {
        return m14549I(th2);
    }

    @Override // kotlinx.coroutines.AbstractC10221w
    /* renamed from: H */
    public final void mo13978H(AbstractC10133j2 j2Var) {
        m14549I(j2Var);
    }

    /* renamed from: I */
    public final boolean m14549I(Object obj) {
        Object obj2;
        C10087d0 d0Var;
        C10087d0 d0Var2;
        C10087d0 d0Var3;
        obj2 = C10013c2.f22141a;
        if (mo13969c0() && (obj2 = m14546K(obj)) == C10013c2.f22142b) {
            return true;
        }
        d0Var = C10013c2.f22141a;
        if (obj2 == d0Var) {
            obj2 = m14521n0(obj);
        }
        d0Var2 = C10013c2.f22141a;
        if (obj2 == d0Var2 || obj2 == C10013c2.f22142b) {
            return true;
        }
        d0Var3 = C10013c2.f22144d;
        if (obj2 == d0Var3) {
            return false;
        }
        mo13982F(obj2);
        return true;
    }

    /* renamed from: I0 */
    protected final CancellationException m14548I0(Throwable th2, String str) {
        CancellationException cancellationException;
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo14542M();
            }
            cancellationException = new C10215u1(str, th2, this);
        }
        return cancellationException;
    }

    /* renamed from: J */
    public void mo3913J(Throwable th2) {
        m14549I(th2);
    }

    /* renamed from: K0 */
    public final String m14545K0() {
        return mo13988q0() + '{' + m14550H0(m14525g0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public String mo14542M() {
        return "Job was cancelled";
    }

    /* renamed from: N */
    public boolean mo3481N(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (!m14549I(th2) || !mo13970a0()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: Q */
    public final AbstractC10000a1 mo14535Q(Function1<? super Throwable, Unit> function1) {
        return mo14510z(false, true, function1);
    }

    /* renamed from: W */
    public final Object m14531W() {
        Object g0 = m14525g0();
        if (!(!(g0 instanceof AbstractC10158p1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(g0 instanceof C10234z)) {
            return C10013c2.m14488h(g0);
        } else {
            throw ((C10234z) g0).f22488a;
        }
    }

    @Override // kotlinx.coroutines.AbstractC10133j2
    /* renamed from: Y */
    public CancellationException mo14190Y() {
        Throwable th2;
        Object g0 = m14525g0();
        CancellationException cancellationException = null;
        if (g0 instanceof C10007b) {
            th2 = ((C10007b) g0).m14506f();
        } else if (g0 instanceof C10234z) {
            th2 = ((C10234z) g0).f22488a;
        } else if (!(g0 instanceof AbstractC10158p1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + g0).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C10215u1("Parent job is " + m14550H0(g0), th2, this);
    }

    /* renamed from: a0 */
    public boolean mo13970a0() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public boolean mo3873b() {
        Object g0 = m14525g0();
        if (!(g0 instanceof AbstractC10158p1) || !((AbstractC10158p1) g0).mo14113b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean mo13969c0() {
        return false;
    }

    /* renamed from: e0 */
    public final AbstractC10213u m14527e0() {
        return (AbstractC10213u) this._parentHandle;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo3485f0(CoroutineContext coroutineContext) {
        return Job.C9996a.m14566f(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: g */
    public final boolean mo14526g() {
        return !(m14525g0() instanceof AbstractC10158p1);
    }

    /* renamed from: g0 */
    public final Object m14525g0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC10127y)) {
                return obj;
            }
            ((AbstractC10127y) obj).mo14023c(this);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.AbstractC9924b
    public final CoroutineContext.AbstractC9926c<?> getKey() {
        return Job.f22120e;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: h */
    public void mo3911h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C10215u1(mo14542M(), null, this);
        }
        mo3913J(cancellationException);
    }

    /* renamed from: h0 */
    protected boolean mo14162h0(Throwable th2) {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.AbstractC9924b, kotlin.coroutines.CoroutineContext
    /* renamed from: i */
    public <E extends CoroutineContext.AbstractC9924b> E mo3484i(CoroutineContext.AbstractC9926c<E> cVar) {
        return (E) Job.C9996a.m14569c(this, cVar);
    }

    /* renamed from: i0 */
    public void mo14524i0(Throwable th2) {
        throw th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo3483j0(CoroutineContext.AbstractC9926c<?> cVar) {
        return Job.C9996a.m14567e(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public final void m14523k0(Job job) {
        if (job == null) {
            m14554E0(C10075h2.f22261k);
            return;
        }
        job.start();
        AbstractC10213u F0 = job.mo14553F0(this);
        m14554E0(F0);
        if (mo14526g()) {
            F0.dispose();
            m14554E0(C10075h2.f22261k);
        }
    }

    /* renamed from: l0 */
    public final boolean m14522l0() {
        Object g0 = m14525g0();
        if ((g0 instanceof C10234z) || ((g0 instanceof C10007b) && ((C10007b) g0).m14505g())) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    protected boolean mo14335m0() {
        return false;
    }

    /* renamed from: o0 */
    public final Object m14520o0(Object obj) {
        Object N0;
        C10087d0 d0Var;
        C10087d0 d0Var2;
        do {
            N0 = m14540N0(m14525g0(), obj);
            d0Var = C10013c2.f22141a;
            if (N0 != d0Var) {
                d0Var2 = C10013c2.f22143c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m14530X(obj));
            }
        } while (N0 == d0Var2);
        return N0;
    }

    /* renamed from: q0 */
    public String mo13988q0() {
        return C10149n0.m14165a(this);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: s */
    public final Sequence<Job> mo14517s() {
        Sequence<Job> b;
        b = C12190k.m7451b(new C10009d(null));
        return b;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int G0;
        do {
            G0 = m14551G0(m14525g0());
            if (G0 == 0) {
                return false;
            }
        } while (G0 != 1);
        return true;
    }

    public String toString() {
        return m14545K0() + '@' + C10149n0.m14164b(this);
    }

    /* renamed from: u0 */
    protected void m14514u0(Throwable th2) {
    }

    /* renamed from: v0 */
    protected void mo14513v0(Object obj) {
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: w0 */
    public <R> R mo3482w0(R r, Function2<? super R, ? super CoroutineContext.AbstractC9924b, ? extends R> function2) {
        return (R) Job.C9996a.m14570b(this, r, function2);
    }

    /* renamed from: x0 */
    protected void mo14464x0() {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: z */
    public final AbstractC10000a1 mo14510z(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        C10234z zVar;
        AbstractC10001a2 p0 = m14519p0(function1, z);
        while (true) {
            Object g0 = m14525g0();
            if (g0 instanceof C10016d1) {
                C10016d1 d1Var = (C10016d1) g0;
                if (!d1Var.mo14113b()) {
                    m14511y0(d1Var);
                } else if (C2113b.m38965a(f22127k, this, g0, p0)) {
                    return p0;
                }
            } else {
                Throwable th2 = null;
                if (g0 instanceof AbstractC10158p1) {
                    C10071g2 d = ((AbstractC10158p1) g0).mo14112d();
                    if (d != null) {
                        AbstractC10000a1 a1Var = C10075h2.f22261k;
                        if (z && (g0 instanceof C10007b)) {
                            synchronized (g0) {
                                th2 = ((C10007b) g0).m14506f();
                                if (th2 == null || ((function1 instanceof C10217v) && !((C10007b) g0).m14504h())) {
                                    if (m14557D(g0, d, p0)) {
                                        if (th2 == null) {
                                            return p0;
                                        }
                                        a1Var = p0;
                                    }
                                }
                                Unit unit = Unit.f22042a;
                            }
                        }
                        if (th2 != null) {
                            if (z2) {
                                function1.invoke(th2);
                            }
                            return a1Var;
                        } else if (m14557D(g0, d, p0)) {
                            return p0;
                        }
                    } else if (g0 != null) {
                        m14561A0((AbstractC10001a2) g0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z2) {
                        if (g0 instanceof C10234z) {
                            zVar = (C10234z) g0;
                        } else {
                            zVar = null;
                        }
                        if (zVar != null) {
                            th2 = zVar.f22488a;
                        }
                        function1.invoke(th2);
                    }
                    return C10075h2.f22261k;
                }
            }
        }
    }
}
