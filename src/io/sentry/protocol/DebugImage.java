package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class DebugImage implements AbstractC8806b1 {
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* renamed from: io.sentry.protocol.DebugImage$a */
    /* loaded from: classes8.dex */
    public static final class C8969a implements AbstractC9030r0<DebugImage> {
        /* renamed from: b */
        public DebugImage mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            DebugImage debugImage = new DebugImage();
            x0Var.m16940g();
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1840639000:
                        if (S.equals("debug_file")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1443345323:
                        if (S.equals("image_addr")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1442803611:
                        if (S.equals("image_size")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1127437170:
                        if (S.equals("code_file")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3002454:
                        if (S.equals("arch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3575610:
                        if (S.equals("type")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3601339:
                        if (S.equals("uuid")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 547804807:
                        if (S.equals("debug_id")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 941842605:
                        if (S.equals("code_id")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        debugImage.debugFile = x0Var.m16801Z0();
                        break;
                    case 1:
                        debugImage.imageAddr = x0Var.m16801Z0();
                        break;
                    case 2:
                        debugImage.imageSize = x0Var.m16805V0();
                        break;
                    case 3:
                        debugImage.codeFile = x0Var.m16801Z0();
                        break;
                    case 4:
                        debugImage.arch = x0Var.m16801Z0();
                        break;
                    case 5:
                        debugImage.type = x0Var.m16801Z0();
                        break;
                    case 6:
                        debugImage.uuid = x0Var.m16801Z0();
                        break;
                    case 7:
                        debugImage.debugId = x0Var.m16801Z0();
                        break;
                    case '\b':
                        debugImage.codeId = x0Var.m16801Z0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        x0Var.m16799b1(g0Var, hashMap, S);
                        break;
                }
            }
            x0Var.m16934p();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.uuid != null) {
            z0Var.m16753z0("uuid").m16918f0(this.uuid);
        }
        if (this.type != null) {
            z0Var.m16753z0("type").m16918f0(this.type);
        }
        if (this.debugId != null) {
            z0Var.m16753z0("debug_id").m16918f0(this.debugId);
        }
        if (this.debugFile != null) {
            z0Var.m16753z0("debug_file").m16918f0(this.debugFile);
        }
        if (this.codeId != null) {
            z0Var.m16753z0("code_id").m16918f0(this.codeId);
        }
        if (this.codeFile != null) {
            z0Var.m16753z0("code_file").m16918f0(this.codeFile);
        }
        if (this.imageAddr != null) {
            z0Var.m16753z0("image_addr").m16918f0(this.imageAddr);
        }
        if (this.imageSize != null) {
            z0Var.m16753z0("image_size").m16919b0(this.imageSize);
        }
        if (this.arch != null) {
            z0Var.m16753z0("arch").m16918f0(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.unknown.get(str));
            }
        }
        z0Var.m16911p();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
