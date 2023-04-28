package kotlin.collections;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9941b;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import nf.C11098x;
import p267of.C11280m;
import p267of.C11281n;
import p267of.C11288u;
import p306qi.C12193m;
import p326ri.C12708m;

@Metadata(m15074d1 = {"\u0000à\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\nH\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0002\u001a\u00020\rH\u0086\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001a)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\f2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0012\u0010\u001c\u001a\u00020\r*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u0012\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u0012\u0010\u001f\u001a\u00020\r*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0010\u001a\u001f\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b \u0010\u0013\u001a\u0012\u0010!\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u001f\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010\u0013\u001a\n\u0010%\u001a\u00020$*\u00020#\u001a!\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010\u0013\u001a+\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\b\b\u0000\u0010\u0000*\u00020'*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b)\u0010*\u001a?\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010,*\n\u0012\u0006\b\u0000\u0012\u00028\u00010+\"\b\b\u0001\u0010\u0000*\u00020'*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b,\u0010.\u001aC\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000/j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`0¢\u0006\u0004\b2\u00103\u001aA\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000/j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`0¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u00020\f*\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u00028\u00000+*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010-\u001a\u00028\u0001¢\u0006\u0004\b8\u0010.\u001a%\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b9\u0010*\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070(*\u00020\u0006\u001a\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0(*\u00020\t\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0(*\u00020\f\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100(*\u00020\u000f\u001a\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020?0(*\u00020>\u001a\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020B0(*\u00020A\u001a\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030(*\u00020D\u001a\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020$0(*\u00020#\u001a%\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010*\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070G*\u00020\u0006\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0G*\u00020\t\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0G*\u00020\f\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100G*\u00020\u000f\u001a\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020?0G*\u00020>\u001a\u0010\u0010N\u001a\b\u0012\u0004\u0012\u00020B0G*\u00020A\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030G*\u00020D\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020$0G*\u00020#\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001aE\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010(\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010UH\u0086\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Z0Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b[\u0010\\\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b]\u0010*\u001a%\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b_\u0010S\u001aJ\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010a0(\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010c\u001a\u007f\u0010\u0000\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010]*\u00060dj\u0002`e*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010f\u001a\u00028\u00012\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\b\u0000\u0010m\u001aq\u0010n\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020\u00062\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bn\u0010o\u001aq\u0010p\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020\f2\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bp\u0010q\u001aq\u0010T\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020#2\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bT\u0010r\u001ai\u0010t\u001a\u00020s\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bt\u0010u\u001aT\u0010v\u001a\u00020s*\u00020\u00062\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020g\u0018\u00010U\u001aT\u0010w\u001a\u00020s*\u00020\f2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020g\u0018\u00010U\u001aT\u0010x\u001a\u00020s*\u00020#2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020g\u0018\u00010U\u001a%\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\by\u0010\\\u001a%\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000z\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b{\u0010|\u001a\n\u0010}\u001a\u00020\r*\u00020\f\"%\u0010\u0081\u0001\u001a\u00020~\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001\"&\u0010\u0084\u0001\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0018\u0010\u0084\u0001\u001a\u00020\r*\u00020\f8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0018\u0010\u0084\u0001\u001a\u00020\r*\u00020\u000f8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0089\u0001"}, m15073d2 = {"T", "", "element", "", "y", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "v", "", "", "z", "", "", "w", "", "", "x", "D", "([Ljava/lang/Object;)Ljava/lang/Object;", "E", "index", "K", "([Ljava/lang/Object;I)Ljava/lang/Object;", "J", "([II)Ljava/lang/Integer;", "O", "([Ljava/lang/Object;Ljava/lang/Object;)I", "L", "P", "M", "N", "d0", "e0", "h0", "", "", "g0", "i0", "", "", "B", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "j0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "k0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "n0", "([Ljava/lang/Integer;)[I", "m0", "u0", "o0", "v0", "s0", "t0", "", "", "r0", "", "", "q0", "", "w0", "p0", "", "D0", "x0", "E0", "B0", "C0", "A0", "z0", "F0", "y0", "", "H0", "([Ljava/lang/Object;)Ljava/util/Set;", "R", "Lkotlin/Function1;", ViewProps.TRANSFORM, "f0", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "Lof/m;", "I0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "A", "", "G0", "other", "Lkotlin/Pair;", "J0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "Q", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "S", "([ILjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([CLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "Y", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "V", "X", "W", "t", "Lkotlin/sequences/Sequence;", "u", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "l0", "Lkotlin/ranges/IntRange;", "F", "([Ljava/lang/Object;)Lkotlin/ranges/IntRange;", "indices", "I", "([Ljava/lang/Object;)I", "lastIndex", "G", "([I)I", "H", "([J)I", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.f */
/* loaded from: classes8.dex */
public class C9899f extends C9897e {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"kotlin/collections/f$a", "", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$a */
    /* loaded from: classes8.dex */
    public static final class C9900a implements Iterable<T>, AbstractC1385a {

        /* renamed from: k */
        final /* synthetic */ Object[] f22051k;

        public C9900a(Object[] objArr) {
            this.f22051k = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C9941b.m14688a(this.f22051k);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"kotlin/collections/f$b", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$b */
    /* loaded from: classes8.dex */
    public static final class C9901b implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f22052a;

        public C9901b(Object[] objArr) {
            this.f22052a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return C9941b.m14688a(this.f22052a);
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$c */
    /* loaded from: classes8.dex */
    public static final class C9902c extends AbstractC9973s implements Function0<Iterator<? extends T>> {

        /* renamed from: k */
        final /* synthetic */ T[] f22053k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9902c(T[] tArr) {
            super(0);
            this.f22053k = tArr;
        }

        /* renamed from: a */
        public final Iterator<T> invoke() {
            return C9941b.m14688a(this.f22053k);
        }
    }

    /* renamed from: A */
    public static <T> List<T> m14972A(T[] tArr) {
        List<T> D0;
        C9971q.m14633g(tArr, "<this>");
        D0 = C9914r.m14790D0(m14959G0(tArr));
        return D0;
    }

    /* renamed from: A0 */
    public static final List<Float> m14971A0(float[] fArr) {
        C9971q.m14633g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: B */
    public static final <T> List<T> m14970B(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        return (List) m14968C(tArr, new ArrayList());
    }

    /* renamed from: B0 */
    public static final List<Integer> m14969B0(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final <C extends Collection<? super T>, T> C m14968C(T[] tArr, C destination) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(destination, "destination");
        for (T t : tArr) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    /* renamed from: C0 */
    public static final List<Long> m14967C0(long[] jArr) {
        C9971q.m14633g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static <T> T m14966D(T[] tArr) {
        boolean z;
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: D0 */
    public static <T> List<T> m14965D0(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        return new ArrayList(C9906j.m14823f(tArr));
    }

    /* renamed from: E */
    public static <T> T m14964E(T[] tArr) {
        boolean z;
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: E0 */
    public static final List<Short> m14963E0(short[] sArr) {
        C9971q.m14633g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static <T> IntRange m14962F(T[] tArr) {
        int I;
        C9971q.m14633g(tArr, "<this>");
        I = m14956I(tArr);
        return new IntRange(0, I);
    }

    /* renamed from: F0 */
    public static final List<Boolean> m14961F0(boolean[] zArr) {
        C9971q.m14633g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static final int m14960G(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: G0 */
    public static final <T> Set<T> m14959G0(T[] tArr) {
        int d;
        C9971q.m14633g(tArr, "<this>");
        d = C11288u.m10255d(tArr.length);
        return (Set) m14924m0(tArr, new LinkedHashSet(d));
    }

    /* renamed from: H */
    public static int m14958H(long[] jArr) {
        C9971q.m14633g(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: H0 */
    public static <T> Set<T> m14957H0(T[] tArr) {
        Set<T> d;
        Set<T> c;
        int d2;
        C9971q.m14633g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            d = C9921w.m14722d();
            return d;
        } else if (length != 1) {
            d2 = C11288u.m10255d(tArr.length);
            return (Set) m14924m0(tArr, new LinkedHashSet(d2));
        } else {
            c = C9920v.m14723c(tArr[0]);
            return c;
        }
    }

    /* renamed from: I */
    public static <T> int m14956I(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: I0 */
    public static <T> Iterable<C11280m<T>> m14955I0(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        return new C11281n(new C9902c(tArr));
    }

    /* renamed from: J */
    public static Integer m14954J(int[] iArr, int i) {
        C9971q.m14633g(iArr, "<this>");
        if (i < 0 || i > m14960G(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: J0 */
    public static <T, R> List<Pair<T, R>> m14953J0(T[] tArr, R[] other) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11098x.m10921a(tArr[i], other[i]));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static <T> T m14952K(T[] tArr, int i) {
        int I;
        C9971q.m14633g(tArr, "<this>");
        if (i >= 0) {
            I = m14956I(tArr);
            if (i <= I) {
                return tArr[i];
            }
        }
        return null;
    }

    /* renamed from: L */
    public static final int m14951L(byte[] bArr, byte b) {
        C9971q.m14633g(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public static final int m14950M(int[] iArr, int i) {
        C9971q.m14633g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static final int m14949N(long[] jArr, long j) {
        C9971q.m14633g(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: O */
    public static <T> int m14948O(T[] tArr, T t) {
        C9971q.m14633g(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C9971q.m14638b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: P */
    public static final int m14947P(short[] sArr, short s) {
        C9971q.m14633g(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static final <A extends Appendable> A m14946Q(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        C9971q.m14633g(bArr, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                buffer.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: R */
    public static final <A extends Appendable> A m14945R(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        C9971q.m14633g(cArr, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Character.valueOf(c)));
            } else {
                buffer.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: S */
    public static final <A extends Appendable> A m14944S(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        C9971q.m14633g(iArr, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Integer.valueOf(i3)));
            } else {
                buffer.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: T */
    public static final <T, A extends Appendable> A m14943T(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C12708m.m5761a(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: U */
    public static /* synthetic */ Appendable m14942U(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return m14943T(objArr, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    /* renamed from: V */
    public static final String m14941V(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        C9971q.m14633g(bArr, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m14946Q(bArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: W */
    public static final String m14940W(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        C9971q.m14633g(cArr, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m14945R(cArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: X */
    public static final String m14939X(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        C9971q.m14633g(iArr, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m14944S(iArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Y */
    public static final <T> String m14938Y(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m14943T(tArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Z */
    public static /* synthetic */ String m14937Z(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m14941V(bArr, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m14936a0(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m14940W(cArr, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m14935b0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m14939X(iArr, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: c0 */
    public static /* synthetic */ String m14934c0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m14938Y(objArr, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: d0 */
    public static <T> T m14933d0(T[] tArr) {
        boolean z;
        int I;
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            I = m14956I(tArr);
            return tArr[I];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: e0 */
    public static final int m14932e0(int[] iArr, int i) {
        C9971q.m14633g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    public static <T, R> List<R> m14931f0(T[] tArr, Function1<? super T, ? extends R> transform) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(transform.invoke(t));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static char m14930g0(char[] cArr) {
        C9971q.m14633g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: h0 */
    public static <T> T m14929h0(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: i0 */
    public static <T> T m14928i0(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: j0 */
    public static final <T> T[] m14927j0(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C9971q.m14634f(tArr2, "copyOf(this, size)");
        C9897e.m14977r(tArr2, comparator);
        return tArr2;
    }

    /* renamed from: k0 */
    public static <T> List<T> m14926k0(T[] tArr, Comparator<? super T> comparator) {
        List<T> d;
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(comparator, "comparator");
        d = C9897e.m14991d(m14927j0(tArr, comparator));
        return d;
    }

    /* renamed from: l0 */
    public static int m14925l0(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: m0 */
    public static final <T, C extends Collection<? super T>> C m14924m0(T[] tArr, C destination) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(destination, "destination");
        for (T t : tArr) {
            destination.add(t);
        }
        return destination;
    }

    /* renamed from: n0 */
    public static int[] m14923n0(Integer[] numArr) {
        C9971q.m14633g(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: o0 */
    public static List<Byte> m14922o0(byte[] bArr) {
        List<Byte> i;
        List<Byte> d;
        C9971q.m14633g(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14908x0(bArr);
        } else {
            d = C9905i.m14825d(Byte.valueOf(bArr[0]));
            return d;
        }
    }

    /* renamed from: p0 */
    public static List<Character> m14921p0(char[] cArr) {
        List<Character> i;
        List<Character> d;
        C9971q.m14633g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14906y0(cArr);
        } else {
            d = C9905i.m14825d(Character.valueOf(cArr[0]));
            return d;
        }
    }

    /* renamed from: q0 */
    public static List<Double> m14920q0(double[] dArr) {
        List<Double> i;
        List<Double> d;
        C9971q.m14633g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14904z0(dArr);
        } else {
            d = C9905i.m14825d(Double.valueOf(dArr[0]));
            return d;
        }
    }

    /* renamed from: r0 */
    public static List<Float> m14919r0(float[] fArr) {
        List<Float> i;
        List<Float> d;
        C9971q.m14633g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14971A0(fArr);
        } else {
            d = C9905i.m14825d(Float.valueOf(fArr[0]));
            return d;
        }
    }

    /* renamed from: s0 */
    public static List<Integer> m14918s0(int[] iArr) {
        List<Integer> i;
        List<Integer> d;
        C9971q.m14633g(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14969B0(iArr);
        } else {
            d = C9905i.m14825d(Integer.valueOf(iArr[0]));
            return d;
        }
    }

    /* renamed from: t */
    public static <T> Iterable<T> m14917t(T[] tArr) {
        boolean z;
        List i;
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C9900a(tArr);
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: t0 */
    public static List<Long> m14916t0(long[] jArr) {
        List<Long> i;
        List<Long> d;
        C9971q.m14633g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14967C0(jArr);
        } else {
            d = C9905i.m14825d(Long.valueOf(jArr[0]));
            return d;
        }
    }

    /* renamed from: u */
    public static <T> Sequence<T> m14915u(T[] tArr) {
        boolean z;
        Sequence<T> e;
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C9901b(tArr);
        }
        e = C12193m.m7448e();
        return e;
    }

    /* renamed from: u0 */
    public static <T> List<T> m14914u0(T[] tArr) {
        List<T> i;
        List<T> d;
        List<T> D0;
        C9971q.m14633g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            D0 = m14965D0(tArr);
            return D0;
        } else {
            d = C9905i.m14825d(tArr[0]);
            return d;
        }
    }

    /* renamed from: v */
    public static boolean m14913v(byte[] bArr, byte b) {
        C9971q.m14633g(bArr, "<this>");
        if (m14951L(bArr, b) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public static List<Short> m14912v0(short[] sArr) {
        List<Short> i;
        List<Short> d;
        C9971q.m14633g(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14963E0(sArr);
        } else {
            d = C9905i.m14825d(Short.valueOf(sArr[0]));
            return d;
        }
    }

    /* renamed from: w */
    public static boolean m14911w(int[] iArr, int i) {
        C9971q.m14633g(iArr, "<this>");
        if (m14950M(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public static List<Boolean> m14910w0(boolean[] zArr) {
        List<Boolean> i;
        List<Boolean> d;
        C9971q.m14633g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (length != 1) {
            return m14961F0(zArr);
        } else {
            d = C9905i.m14825d(Boolean.valueOf(zArr[0]));
            return d;
        }
    }

    /* renamed from: x */
    public static boolean m14909x(long[] jArr, long j) {
        C9971q.m14633g(jArr, "<this>");
        if (m14949N(jArr, j) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    public static final List<Byte> m14908x0(byte[] bArr) {
        C9971q.m14633g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: y */
    public static <T> boolean m14907y(T[] tArr, T t) {
        int O;
        C9971q.m14633g(tArr, "<this>");
        O = m14948O(tArr, t);
        if (O >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y0 */
    public static final List<Character> m14906y0(char[] cArr) {
        C9971q.m14633g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    /* renamed from: z */
    public static boolean m14905z(short[] sArr, short s) {
        C9971q.m14633g(sArr, "<this>");
        if (m14947P(sArr, s) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public static final List<Double> m14904z0(double[] dArr) {
        C9971q.m14633g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }
}
