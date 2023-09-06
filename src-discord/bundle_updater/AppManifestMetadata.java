package com.discord.bundle_updater;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/discord/bundle_updater/AppManifestMetadata;", "", "seen1", "", "build", "", "commit", "confirmUpdate", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBuild", "()Ljava/lang/String;", "getCommit", "getConfirmUpdate$annotations", "()V", "getConfirmUpdate", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AppManifestMetadata {
    public static final Companion Companion = new Companion(null);
    private final String build;
    private final String commit;
    private final boolean confirmUpdate;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/bundle_updater/AppManifestMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/AppManifestMetadata;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppManifestMetadata> serializer() {
            return AppManifestMetadata$$serializer.INSTANCE;
        }
    }

    public  AppManifestMetadata(int i10, String str, String str2, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, AppManifestMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.build = str;
        this.commit = str2;
        if ((i10 & 4) == 0) {
            this.confirmUpdate = false;
        } else {
            this.confirmUpdate = z10;
        }
    }

    public static  AppManifestMetadata copy$default(AppManifestMetadata appManifestMetadata, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appManifestMetadata.build;
        }
        if ((i10 & 2) != 0) {
            str2 = appManifestMetadata.commit;
        }
        if ((i10 & 4) != 0) {
            z10 = appManifestMetadata.confirmUpdate;
        }
        return appManifestMetadata.copy(str, str2, z10);
    }

    public static  void getConfirmUpdate$annotations() {
    }

    public static final void write$Self(AppManifestMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.y(serialDesc, 0, self.build);
        output.y(serialDesc, 1, self.commit);
        if (output.z(serialDesc, 2) || self.confirmUpdate) {
            z10 = true;
        }
        if (z10) {
            output.x(serialDesc, 2, self.confirmUpdate);
        }
    }

    public final String component1() {
        return this.build;
    }

    public final String component2() {
        return this.commit;
    }

    public final boolean component3() {
        return this.confirmUpdate;
    }

    public final AppManifestMetadata copy(String build, String commit, boolean z10) {
        q.h(build, "build");
        q.h(commit, "commit");
        return new AppManifestMetadata(build, commit, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppManifestMetadata)) {
            return false;
        }
        AppManifestMetadata appManifestMetadata = (AppManifestMetadata) obj;
        return q.c(this.build, appManifestMetadata.build) && q.c(this.commit, appManifestMetadata.commit) && this.confirmUpdate == appManifestMetadata.confirmUpdate;
    }

    public final String getBuild() {
        return this.build;
    }

    public final String getCommit() {
        return this.commit;
    }

    public final boolean getConfirmUpdate() {
        return this.confirmUpdate;
    }

    public int hashCode() {
        int hashCode = ((this.build.hashCode() * 31) + this.commit.hashCode()) * 31;
        boolean z10 = this.confirmUpdate;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public final WritableNativeMap toNativeMap() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("build", this.build), x.a("commit", this.commit), x.a("confirm_update", Boolean.valueOf(this.confirmUpdate)));
    }

    public String toString() {
        String str = this.build;
        String str2 = this.commit;
        boolean z10 = this.confirmUpdate;
        return "AppManifestMetadata(build=" + str + ", commit=" + str2 + ", confirmUpdate=" + z10 + ")";
    }

    public AppManifestMetadata(String build, String commit, boolean z10) {
        q.h(build, "build");
        q.h(commit, "commit");
        this.build = build;
        this.commit = commit;
        this.confirmUpdate = z10;
    }

    public  AppManifestMetadata(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? false : z10);
    }
}
