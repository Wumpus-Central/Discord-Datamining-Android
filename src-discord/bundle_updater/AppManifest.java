package com.discord.bundle_updater;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lf.v;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, d2 = {"Lcom/discord/bundle_updater/AppManifest;", "", "seen1", "", "metadata", "Lcom/discord/bundle_updater/AppManifestMetadata;", "hashes", "", "", "patches", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;)V", "getHashes", "()Ljava/util/Map;", "getMetadata", "()Lcom/discord/bundle_updater/AppManifestMetadata;", "getPatches", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AppManifest {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> hashes;
    private final AppManifestMetadata metadata;
    private final Map<String, String> patches;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/bundle_updater/AppManifest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/AppManifest;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppManifest> serializer() {
            return AppManifest$$serializer.INSTANCE;
        }
    }

    public  AppManifest(int i10, AppManifestMetadata appManifestMetadata, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        Map<String, String> h10;
        Map<String, String> h11;
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, AppManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = appManifestMetadata;
        if ((i10 & 2) == 0) {
            h11 = v.h();
            this.hashes = h11;
        } else {
            this.hashes = map;
        }
        if ((i10 & 4) == 0) {
            h10 = v.h();
            this.patches = h10;
            return;
        }
        this.patches = map2;
    }

    
    public static  AppManifest copy$default(AppManifest appManifest, AppManifestMetadata appManifestMetadata, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appManifestMetadata = appManifest.metadata;
        }
        if ((i10 & 2) != 0) {
            map = appManifest.hashes;
        }
        if ((i10 & 4) != 0) {
            map2 = appManifest.patches;
        }
        return appManifest.copy(appManifestMetadata, map, map2);
    }

    
    
    
    
    
    
    public static final void write$Self(com.discord.bundle_updater.AppManifest r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.AppManifest.write$Self(com.discord.bundle_updater.AppManifest, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final AppManifestMetadata component1() {
        return this.metadata;
    }

    public final Map<String, String> component2() {
        return this.hashes;
    }

    public final Map<String, String> component3() {
        return this.patches;
    }

    public final AppManifest copy(AppManifestMetadata metadata, Map<String, String> hashes, Map<String, String> patches) {
        q.h(metadata, "metadata");
        q.h(hashes, "hashes");
        q.h(patches, "patches");
        return new AppManifest(metadata, hashes, patches);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppManifest)) {
            return false;
        }
        AppManifest appManifest = (AppManifest) obj;
        return q.c(this.metadata, appManifest.metadata) && q.c(this.hashes, appManifest.hashes) && q.c(this.patches, appManifest.patches);
    }

    public final Map<String, String> getHashes() {
        return this.hashes;
    }

    public final AppManifestMetadata getMetadata() {
        return this.metadata;
    }

    public final Map<String, String> getPatches() {
        return this.patches;
    }

    public int hashCode() {
        return (((this.metadata.hashCode() * 31) + this.hashes.hashCode()) * 31) + this.patches.hashCode();
    }

    public String toString() {
        AppManifestMetadata appManifestMetadata = this.metadata;
        Map<String, String> map = this.hashes;
        Map<String, String> map2 = this.patches;
        return "AppManifest(metadata=" + appManifestMetadata + ", hashes=" + map + ", patches=" + map2 + ")";
    }

    public AppManifest(AppManifestMetadata metadata, Map<String, String> hashes, Map<String, String> patches) {
        q.h(metadata, "metadata");
        q.h(hashes, "hashes");
        q.h(patches, "patches");
        this.metadata = metadata;
        this.hashes = hashes;
        this.patches = patches;
    }

    public  AppManifest(AppManifestMetadata appManifestMetadata, Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appManifestMetadata, (i10 & 2) != 0 ? v.h() : map, (i10 & 4) != 0 ? v.h() : map2);
    }
}
