package net.time4j.calendar;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.C10892f0;
import net.time4j.C11045z0;
import net.time4j.EnumC11039x0;
import net.time4j.calendar.C10829b;
import net.time4j.calendar.service.C10876f;
import net.time4j.calendar.service.C10877g;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10996f;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8068k;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;
import p143hj.AbstractC8086w;
import p143hj.AbstractC8091z;
import p143hj.C8059h0;
import p143hj.EnumC8076n0;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8638h;
import p161ij.AbstractC8669t;

@AbstractC8633c("dangi")
/* loaded from: classes8.dex */
public final class KoreanCalendar extends AbstractC10840f<EnumC10826e, KoreanCalendar> implements AbstractC8638h {

    /* renamed from: A */
    public static final AbstractC10865q<EnumC11039x0, KoreanCalendar> f38873A;

    /* renamed from: B */
    private static final C10866r<KoreanCalendar> f38874B;

    /* renamed from: C */
    public static final AbstractC10857l<KoreanCalendar> f38875C;

    /* renamed from: D */
    private static final AbstractC10838d<KoreanCalendar> f38876D;

    /* renamed from: E */
    private static final C8059h0<EnumC10826e, KoreanCalendar> f38877E;

    /* renamed from: q */
    private static final int[] f24002q = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6
    };

    /* renamed from: r */
    public static final AbstractC8079p<EnumC10851k> f24003r;

    /* renamed from: s */
    public static final AbstractC8079p<Integer> f24004s;
    private static final long serialVersionUID = -4284841131270593971L;

    /* renamed from: t */
    public static final AbstractC8079p<Integer> f24005t;

    /* renamed from: u */
    public static final AbstractC8669t<C10836c> f24006u;

    /* renamed from: v */
    public static final AbstractC8079p<EnumC10863p> f24007v;

    /* renamed from: w */
    public static final AbstractC8669t<C10847h> f24008w;

    /* renamed from: x */
    public static final AbstractC10865q<Integer, KoreanCalendar> f24009x;

    /* renamed from: y */
    public static final AbstractC10865q<Integer, KoreanCalendar> f24010y;

    /* renamed from: z */
    public static final AbstractC10865q<Integer, KoreanCalendar> f24011z;

    /* loaded from: classes8.dex */
    private static class SPX implements Externalizable {
        private static final long serialVersionUID = 1;

        /* renamed from: k */
        private transient Object f24012k;

        public SPX() {
        }

        /* renamed from: a */
        private KoreanCalendar m12176a(ObjectInput objectInput) {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            C10847h d = C10847h.m12031d(readByte3);
            if (readBoolean) {
                d = d.m12030e();
            }
            return KoreanCalendar.m12178p0(readByte, readByte2, d, readByte4);
        }

        /* renamed from: b */
        private void m12175b(ObjectOutput objectOutput) {
            AbstractC10840f fVar = (AbstractC10840f) this.f24012k;
            objectOutput.writeByte(fVar.m12082Z());
            objectOutput.writeByte(fVar.m12071j0().getNumber());
            objectOutput.writeByte(fVar.m12075f0().getNumber());
            objectOutput.writeBoolean(fVar.m12075f0().m12032c());
            objectOutput.writeByte(fVar.m12069o());
        }

        private Object readResolve() {
            return this.f24012k;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readByte() == 15) {
                this.f24012k = m12176a(objectInput);
                return;
            }
            throw new InvalidObjectException("Unknown calendar type.");
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeByte(15);
            m12175b(objectOutput);
        }

        SPX(Object obj) {
            this.f24012k = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.calendar.KoreanCalendar$a */
    /* loaded from: classes8.dex */
    public static class C10822a implements AbstractC8083t<KoreanCalendar, AbstractC8068k<KoreanCalendar>> {
        C10822a() {
        }

        /* renamed from: a */
        public AbstractC8068k<KoreanCalendar> apply(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.f38876D;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$b */
    /* loaded from: classes8.dex */
    private static class C10823b implements AbstractC8091z<KoreanCalendar, EnumC10851k> {
        private C10823b() {
        }

        /* synthetic */ C10823b(C10822a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: f */
        public EnumC10851k mo11084d(KoreanCalendar koreanCalendar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: i */
        public EnumC10851k mo11078k(KoreanCalendar koreanCalendar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: j */
        public EnumC10851k mo11076n(KoreanCalendar koreanCalendar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: o */
        public boolean mo11081h(KoreanCalendar koreanCalendar, EnumC10851k kVar) {
            return kVar == EnumC10851k.DANGI;
        }

        /* renamed from: p */
        public KoreanCalendar mo11077m(KoreanCalendar koreanCalendar, EnumC10851k kVar, boolean z) {
            if (mo11081h(koreanCalendar, kVar)) {
                return koreanCalendar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + kVar);
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$c */
    /* loaded from: classes8.dex */
    private static class C10824c extends AbstractC10828a<KoreanCalendar> {
        C10824c() {
            super(KoreanCalendar.class);
        }

        /* renamed from: e */
        public KoreanCalendar mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            AbstractC10849j jVar;
            int s = qVar.mo11370s(C10829b.f24026a);
            if (s == Integer.MIN_VALUE) {
                AbstractC8669t<C10836c> tVar = KoreanCalendar.f24006u;
                if (qVar.mo11377e(tVar)) {
                    AbstractC8079p<Integer> pVar = KoreanCalendar.f24004s;
                    if (qVar.mo11377e(pVar)) {
                        jVar = ((C10836c) qVar.mo11371r(tVar)).m12109m(qVar.mo11370s(pVar));
                    }
                }
                int s2 = qVar.mo11370s(EnumC10851k.DANGI.m12010c());
                if (s2 != Integer.MIN_VALUE) {
                    jVar = AbstractC10849j.m12017a(s2);
                } else {
                    jVar = null;
                }
            } else {
                jVar = AbstractC10849j.m12016b(s);
            }
            if (jVar == null) {
                qVar.mo15654D(EnumC8076n0.ERROR_MESSAGE, "Cannot determine East Asian year.");
                return null;
            }
            AbstractC8669t<C10847h> tVar2 = KoreanCalendar.f24008w;
            if (qVar.mo11377e(tVar2)) {
                C10847h hVar = (C10847h) qVar.mo11371r(tVar2);
                int s3 = qVar.mo11370s(KoreanCalendar.f24010y);
                if (s3 != Integer.MIN_VALUE) {
                    return KoreanCalendar.m12177q0(jVar, hVar, s3);
                }
            } else {
                int s4 = qVar.mo11370s(KoreanCalendar.f24011z);
                if (s4 != Integer.MIN_VALUE && s4 >= 1) {
                    return (KoreanCalendar) KoreanCalendar.m12177q0(jVar, C10847h.m12031d(1), 1).m20683K(s4 - 1, EnumC10826e.DAYS);
                }
            }
            return null;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$d */
    /* loaded from: classes8.dex */
    private static class C10825d extends AbstractC10838d<KoreanCalendar> {

        /* renamed from: d */
        private static final List<C11028p> f24013d;

        /* renamed from: e */
        private static final long f24014e = C10892f0.m11875L0(1908, 4, 1).mo12079c();

        /* renamed from: f */
        private static final long f24015f = C10892f0.m11875L0(1912, 1, 1).mo12079c();

        /* renamed from: g */
        private static final long f24016g = C10892f0.m11875L0(1954, 3, 21).mo12079c();

        /* renamed from: h */
        private static final long f24017h = C10892f0.m11875L0(1961, 8, 10).mo12079c();

        static {
            ArrayList arrayList = new ArrayList(5);
            EnumC10996f fVar = EnumC10996f.AHEAD_OF_UTC;
            arrayList.add(C11028p.m11194c(fVar, 126, 58, 0.0d));
            arrayList.add(C11028p.m11182o(fVar, 8, 30));
            arrayList.add(C11028p.m11182o(fVar, 9, 0));
            arrayList.add(C11028p.m11182o(fVar, 8, 30));
            arrayList.add(C11028p.m11182o(fVar, 9, 0));
            f24013d = Collections.unmodifiableList(arrayList);
        }

        private C10825d() {
        }

        @Override // net.time4j.calendar.AbstractC10838d
        /* renamed from: h */
        int[] mo12103h() {
            return KoreanCalendar.f24002q;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.calendar.AbstractC10838d
        /* renamed from: i */
        public C11028p mo12102i(long j) {
            if (j < f24014e) {
                return f24013d.get(0);
            }
            if (j < f24015f) {
                return f24013d.get(1);
            }
            if (j < f24016g) {
                return f24013d.get(2);
            }
            if (j < f24017h) {
                return f24013d.get(3);
            }
            return f24013d.get(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x */
        public KoreanCalendar mo12106e(int i, int i2, C10847h hVar, int i3, long j) {
            return new KoreanCalendar(i, i2, hVar, i3, j, null);
        }

        /* synthetic */ C10825d(C10822a aVar) {
            this();
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$e */
    /* loaded from: classes8.dex */
    public enum EnumC10826e implements AbstractC8086w {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);
        

        /* renamed from: k */
        private final transient double f24024k;

        EnumC10826e(double d) {
            this.f24024k = d;
        }

        @Override // p143hj.AbstractC8086w
        public double getLength() {
            return this.f24024k;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$f */
    /* loaded from: classes8.dex */
    private static class C10827f implements AbstractC8091z<KoreanCalendar, Integer> {
        private C10827f() {
        }

        /* synthetic */ C10827f(C10822a aVar) {
            this();
        }

        /* renamed from: f */
        private int m12162f(KoreanCalendar koreanCalendar) {
            return ((koreanCalendar.m12082Z() * 60) + koreanCalendar.m12071j0().getNumber()) - 364;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: i */
        public Integer mo11084d(KoreanCalendar koreanCalendar) {
            return 5332;
        }

        /* renamed from: j */
        public Integer mo11078k(KoreanCalendar koreanCalendar) {
            return 3978;
        }

        /* renamed from: o */
        public Integer mo11076n(KoreanCalendar koreanCalendar) {
            return Integer.valueOf(m12162f(koreanCalendar));
        }

        /* renamed from: p */
        public boolean mo11081h(KoreanCalendar koreanCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = mo11078k(koreanCalendar).intValue();
            int intValue2 = mo11084d(koreanCalendar).intValue();
            if (num.intValue() < intValue || num.intValue() > intValue2) {
                return false;
            }
            return true;
        }

        /* renamed from: q */
        public KoreanCalendar mo11077m(KoreanCalendar koreanCalendar, Integer num, boolean z) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            } else if (mo11081h(koreanCalendar, num)) {
                return (KoreanCalendar) koreanCalendar.m20683K(num.intValue() - m12162f(koreanCalendar), EnumC10826e.YEARS);
            } else {
                throw new IllegalArgumentException("Invalid year of era: " + num);
            }
        }
    }

    static {
        EnumC10851k kVar = EnumC10851k.DANGI;
        AbstractC8079p<EnumC10851k> a = kVar.m12012a();
        f24003r = a;
        C10876f fVar = new C10876f("CYCLE", KoreanCalendar.class, 72, 94, (char) 0, null, null);
        f24004s = fVar;
        AbstractC8079p<Integer> c = kVar.m12010c();
        f24005t = c;
        C10839e eVar = C10839e.f24039k;
        f24006u = eVar;
        C10848i x = C10848i.m12019x();
        f24007v = x;
        C10846g gVar = C10846g.f24052k;
        f24008w = gVar;
        C10876f fVar2 = new C10876f("MONTH_AS_ORDINAL", KoreanCalendar.class, 1, 12, (char) 0, null, null);
        f24009x = fVar2;
        C10876f fVar3 = new C10876f("DAY_OF_MONTH", KoreanCalendar.class, 1, 30, 'd');
        f24010y = fVar3;
        C10876f fVar4 = new C10876f("DAY_OF_YEAR", KoreanCalendar.class, 1, 355, 'D');
        f24011z = fVar4;
        C10877g gVar2 = new C10877g(KoreanCalendar.class, m12179o0());
        f38873A = gVar2;
        C10866r<KoreanCalendar> rVar = new C10866r<>(KoreanCalendar.class, fVar3, gVar2);
        f38874B = rVar;
        f38875C = rVar;
        C10825d dVar = new C10825d(null);
        f38876D = dVar;
        C8059h0.C8061b d = C8059h0.C8061b.m20699j(EnumC10826e.class, KoreanCalendar.class, new C10824c(), dVar).m20705d(a, new C10823b(null)).m20705d(fVar, AbstractC10840f.m12081a0(eVar));
        C10827f fVar5 = new C10827f(null);
        EnumC10826e eVar2 = EnumC10826e.YEARS;
        C8059h0.C8061b d2 = d.m20704e(c, fVar5, eVar2).m20704e(eVar, AbstractC10840f.m12070k0(gVar), eVar2).m20705d(x, C10848i.m12019x());
        AbstractC8091z h0 = AbstractC10840f.m12073h0(fVar3);
        EnumC10826e eVar3 = EnumC10826e.MONTHS;
        C8059h0.C8061b e = d2.m20704e(gVar, h0, eVar3).m20704e(fVar2, AbstractC10840f.m12074g0(fVar3), eVar3);
        AbstractC8091z b0 = AbstractC10840f.m12080b0();
        EnumC10826e eVar4 = EnumC10826e.DAYS;
        C8059h0.C8061b d3 = e.m20704e(fVar3, b0, eVar4).m20704e(fVar4, AbstractC10840f.m12077d0(), eVar4).m20704e(gVar2, new C10870s(m12179o0(), new C10822a()), eVar4).m20705d(rVar, C10866r.m11949H(rVar)).m20705d(C10829b.f24026a, new C10859n(dVar, fVar4));
        EnumC10826e eVar5 = EnumC10826e.CYCLES;
        C8059h0.C8061b g = d3.m20702g(eVar5, AbstractC10840f.m12072i0(0), eVar5.getLength(), Collections.singleton(eVar2)).m20702g(eVar2, AbstractC10840f.m12072i0(1), eVar2.getLength(), Collections.singleton(eVar5)).m20702g(eVar3, AbstractC10840f.m12072i0(2), eVar3.getLength(), Collections.emptySet());
        EnumC10826e eVar6 = EnumC10826e.WEEKS;
        f38877E = g.m20702g(eVar6, AbstractC10840f.m12072i0(3), eVar6.getLength(), Collections.singleton(eVar4)).m20702g(eVar4, AbstractC10840f.m12072i0(4), eVar4.getLength(), Collections.singleton(eVar6)).m20703f(new C10829b.C10835g(KoreanCalendar.class, fVar3, fVar4, m12179o0())).m20701h();
    }

    /* synthetic */ KoreanCalendar(int i, int i2, C10847h hVar, int i3, long j, C10822a aVar) {
        this(i, i2, hVar, i3, j);
    }

    /* renamed from: o0 */
    public static C11045z0 m12179o0() {
        return C11045z0.m11129j(new Locale("ko", "KR"));
    }

    /* renamed from: p0 */
    static KoreanCalendar m12178p0(int i, int i2, C10847h hVar, int i3) {
        return new KoreanCalendar(i, i2, hVar, i3, f38876D.m12091t(i, i2, hVar, i3));
    }

    /* renamed from: q0 */
    public static KoreanCalendar m12177q0(AbstractC10849j jVar, C10847h hVar, int i) {
        return m12178p0(jVar.m12015c(), jVar.m12014e().getNumber(), hVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8069k0
    /* renamed from: G */
    public C8059h0<EnumC10826e, KoreanCalendar> mo11639t() {
        return f38877E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.calendar.AbstractC10840f
    /* renamed from: Y */
    public AbstractC10838d<KoreanCalendar> mo12083Y() {
        return f38876D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public KoreanCalendar mo11638u() {
        return this;
    }

    private KoreanCalendar(int i, int i2, C10847h hVar, int i3, long j) {
        super(i, i2, hVar, i3, j);
    }
}
