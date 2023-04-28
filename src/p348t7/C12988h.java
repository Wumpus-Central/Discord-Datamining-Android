package p348t7;

import p079e7.C6722k;
import p080e8.AbstractC6753i;
import p080e8.C6738a;
import p080e8.C6745e;
import p080e8.C6754j;
import p080e8.C6760m;
import p099f8.C7079a;
import p119g9.C7558r;
import p119g9.C7570y;
import p228m7.C10530u;
import p459z7.C14576a;

/* renamed from: t7.h */
/* loaded from: classes7.dex */
final class C12988h {

    /* renamed from: a */
    static final String[] f29145a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static C6745e m4831a(int i, C7570y yVar) {
        int n = yVar.m22002n();
        if (yVar.m22002n() == 1684108385) {
            yVar.m22016Q(8);
            String y = yVar.m21991y(n - 16);
            return new C6745e("und", y, y);
        }
        C7558r.m22104h("MetadataUtil", "Failed to parse comment attribute: " + AbstractC12971a.m4927a(i));
        return null;
    }

    /* renamed from: b */
    private static C6738a m4830b(C7570y yVar) {
        String str;
        int n = yVar.m22002n();
        if (yVar.m22002n() == 1684108385) {
            int b = AbstractC12971a.m4926b(yVar.m22002n());
            if (b == 13) {
                str = "image/jpeg";
            } else if (b == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                C7558r.m22104h("MetadataUtil", "Unrecognized cover art flags: " + b);
                return null;
            }
            yVar.m22016Q(4);
            int i = n - 16;
            byte[] bArr = new byte[i];
            yVar.m22006j(bArr, 0, i);
            return new C6738a(str, null, 3, bArr);
        }
        C7558r.m22104h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static C14576a.AbstractC14577b m4829c(C7570y yVar) {
        int e = yVar.m22011e() + yVar.m22002n();
        int n = yVar.m22002n();
        int i = (n >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & n;
                if (i2 == 6516084) {
                    return m4831a(n, yVar);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return m4824h(n, "TIT2", yVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return m4824h(n, "TCOM", yVar);
                }
                if (i2 == 6578553) {
                    return m4824h(n, "TDRC", yVar);
                }
                if (i2 == 4280916) {
                    return m4824h(n, "TPE1", yVar);
                }
                if (i2 == 7630703) {
                    return m4824h(n, "TSSE", yVar);
                }
                if (i2 == 6384738) {
                    return m4824h(n, "TALB", yVar);
                }
                if (i2 == 7108978) {
                    return m4824h(n, "USLT", yVar);
                }
                if (i2 == 6776174) {
                    return m4824h(n, "TCON", yVar);
                }
                if (i2 == 6779504) {
                    return m4824h(n, "TIT1", yVar);
                }
            } else if (n == 1735291493) {
                return m4825g(yVar);
            } else {
                if (n == 1684632427) {
                    return m4828d(n, "TPOS", yVar);
                }
                if (n == 1953655662) {
                    return m4828d(n, "TRCK", yVar);
                }
                if (n == 1953329263) {
                    return m4823i(n, "TBPM", yVar, true, false);
                }
                if (n == 1668311404) {
                    return m4823i(n, "TCMP", yVar, true, true);
                }
                if (n == 1668249202) {
                    return m4830b(yVar);
                }
                if (n == 1631670868) {
                    return m4824h(n, "TPE2", yVar);
                }
                if (n == 1936682605) {
                    return m4824h(n, "TSOT", yVar);
                }
                if (n == 1936679276) {
                    return m4824h(n, "TSO2", yVar);
                }
                if (n == 1936679282) {
                    return m4824h(n, "TSOA", yVar);
                }
                if (n == 1936679265) {
                    return m4824h(n, "TSOP", yVar);
                }
                if (n == 1936679791) {
                    return m4824h(n, "TSOC", yVar);
                }
                if (n == 1920233063) {
                    return m4823i(n, "ITUNESADVISORY", yVar, false, false);
                }
                if (n == 1885823344) {
                    return m4823i(n, "ITUNESGAPLESS", yVar, false, true);
                }
                if (n == 1936683886) {
                    return m4824h(n, "TVSHOWSORT", yVar);
                }
                if (n == 1953919848) {
                    return m4824h(n, "TVSHOW", yVar);
                }
                if (n == 757935405) {
                    return m4827e(yVar, e);
                }
            }
            C7558r.m22110b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC12971a.m4927a(n));
            yVar.m22017P(e);
            return null;
        } finally {
            yVar.m22017P(e);
        }
    }

    /* renamed from: d */
    private static C6760m m4828d(int i, String str, C7570y yVar) {
        int n = yVar.m22002n();
        if (yVar.m22002n() == 1684108385 && n >= 22) {
            yVar.m22016Q(10);
            int J = yVar.m22023J();
            if (J > 0) {
                String str2 = "" + J;
                int J2 = yVar.m22023J();
                if (J2 > 0) {
                    str2 = str2 + "/" + J2;
                }
                return new C6760m(str, null, str2);
            }
        }
        C7558r.m22104h("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC12971a.m4927a(i));
        return null;
    }

    /* renamed from: e */
    private static AbstractC6753i m4827e(C7570y yVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (yVar.m22011e() < i) {
            int e = yVar.m22011e();
            int n = yVar.m22002n();
            int n2 = yVar.m22002n();
            yVar.m22016Q(4);
            if (n2 == 1835360622) {
                str = yVar.m21991y(n - 12);
            } else if (n2 == 1851878757) {
                str2 = yVar.m21991y(n - 12);
            } else {
                if (n2 == 1684108385) {
                    i2 = e;
                    i3 = n;
                }
                yVar.m22016Q(n - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        yVar.m22017P(i2);
        yVar.m22016Q(16);
        return new C6754j(str, str2, yVar.m21991y(i3 - 16));
    }

    /* renamed from: f */
    public static C7079a m4826f(C7570y yVar, int i, String str) {
        while (true) {
            int e = yVar.m22011e();
            if (e >= i) {
                return null;
            }
            int n = yVar.m22002n();
            if (yVar.m22002n() == 1684108385) {
                int n2 = yVar.m22002n();
                int n3 = yVar.m22002n();
                int i2 = n - 16;
                byte[] bArr = new byte[i2];
                yVar.m22006j(bArr, 0, i2);
                return new C7079a(str, bArr, n3, n2);
            }
            yVar.m22017P(e + n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p080e8.C6760m m4825g(p119g9.C7570y r3) {
        /*
            int r3 = m4822j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = p348t7.C12988h.f29145a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            e8.m r1 = new e8.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p119g9.C7558r.m22104h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t7.C12988h.m4825g(g9.y):e8.m");
    }

    /* renamed from: h */
    private static C6760m m4824h(int i, String str, C7570y yVar) {
        int n = yVar.m22002n();
        if (yVar.m22002n() == 1684108385) {
            yVar.m22016Q(8);
            return new C6760m(str, null, yVar.m21991y(n - 16));
        }
        C7558r.m22104h("MetadataUtil", "Failed to parse text attribute: " + AbstractC12971a.m4927a(i));
        return null;
    }

    /* renamed from: i */
    private static AbstractC6753i m4823i(int i, String str, C7570y yVar, boolean z, boolean z2) {
        int j = m4822j(yVar);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j < 0) {
            C7558r.m22104h("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC12971a.m4927a(i));
            return null;
        } else if (z) {
            return new C6760m(str, null, Integer.toString(j));
        } else {
            return new C6745e("und", str, Integer.toString(j));
        }
    }

    /* renamed from: j */
    private static int m4822j(C7570y yVar) {
        yVar.m22016Q(4);
        if (yVar.m22002n() == 1684108385) {
            yVar.m22016Q(8);
            return yVar.m22029D();
        }
        C7558r.m22104h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m4821k(int i, C10530u uVar, C6722k.C6724b bVar) {
        if (i == 1 && uVar.m12929a()) {
            bVar.m24511M(uVar.f23283a).m24510N(uVar.f23284b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4820l(int r5, p459z7.C14576a r6, p459z7.C14576a r7, p079e7.C6722k.C6724b r8, p459z7.C14576a... r9) {
        /*
            z7.a r0 = new z7.a
            r1 = 0
            z7.a$b[] r2 = new p459z7.C14576a.AbstractC14577b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = r1
        L_0x0014:
            int r6 = r7.m183f()
            if (r5 >= r6) goto L_0x003c
            z7.a$b r6 = r7.m184e(r5)
            boolean r3 = r6 instanceof p099f8.C7079a
            if (r3 == 0) goto L_0x0039
            f8.a r6 = (p099f8.C7079a) r6
            java.lang.String r3 = r6.f15454k
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            z7.a r5 = new z7.a
            z7.a$b[] r7 = new p459z7.C14576a.AbstractC14577b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            z7.a r6 = r6.m185b(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.m183f()
            if (r5 <= 0) goto L_0x0052
            r8.m24500X(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t7.C12988h.m4820l(int, z7.a, z7.a, e7.k$b, z7.a[]):void");
    }
}
