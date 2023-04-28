package p119g9;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: g9.k */
/* loaded from: classes5.dex */
public final class C7541k {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m22290a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String t = C7562u.m22068t(str);
        t.hashCode();
        switch (t.hashCode()) {
            case -2123537834:
                if (t.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (t.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (t.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (t.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (t.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (t.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (t.equals("application/mp4")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (t.equals("text/vtt")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (t.equals("audio/x-matroska")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (t.equals("application/webm")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (t.equals("video/x-flv")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (t.equals("audio/ac3")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (t.equals("audio/ac4")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (t.equals("audio/amr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (t.equals("audio/mp4")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (t.equals("audio/ogg")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (t.equals("audio/wav")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (t.equals("video/mp4")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (t.equals("audio/3gpp")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (t.equals("audio/eac3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (t.equals("audio/flac")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (t.equals("audio/mpeg")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (t.equals("audio/webm")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (t.equals("video/x-matroska")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\b':
            case '\t':
            case 22:
            case 23:
                return 6;
            case 4:
            case '\r':
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case '\n':
                return 5;
            case '\f':
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static int m22289b(Map<String, List<String>> map) {
        String str;
        List<String> list = map.get("Content-Type");
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            str = list.get(0);
        }
        return m22290a(str);
    }

    /* renamed from: c */
    public static int m22288c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return -1;
    }
}
