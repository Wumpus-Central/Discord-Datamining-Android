package p045cj;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.json.Json;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m15073d2 = {"Lcj/r;", "Lcj/h;", "", "b", "p", "c", "o", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "json", "", "d", "I", "level", "Lcj/k0;", "writer", "<init>", "(Lcj/k0;Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.r */
/* loaded from: classes8.dex */
public final class C4065r extends C4040h {

    /* renamed from: c */
    private final Json f6690c;

    /* renamed from: d */
    private int f6691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4065r(AbstractC4049k0 writer, Json json) {
        super(writer);
        C9971q.m14633g(writer, "writer");
        C9971q.m14633g(json, "json");
        this.f6690c = json;
    }

    @Override // p045cj.C4040h
    /* renamed from: b */
    public void mo32899b() {
        m32961n(true);
        this.f6691d++;
    }

    @Override // p045cj.C4040h
    /* renamed from: c */
    public void mo32898c() {
        m32961n(false);
        m32963j(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        int i = this.f6691d;
        for (int i2 = 0; i2 < i; i2++) {
            m32963j(this.f6690c.m13765e().m13734j());
        }
    }

    @Override // p045cj.C4040h
    /* renamed from: o */
    public void mo32897o() {
        m32966e(' ');
    }

    @Override // p045cj.C4040h
    /* renamed from: p */
    public void mo32896p() {
        this.f6691d--;
    }
}
