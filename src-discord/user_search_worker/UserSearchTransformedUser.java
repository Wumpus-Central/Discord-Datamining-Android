package com.discord.user_search_worker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kg.x;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import lg.v;
import vj.f;
import xj.e;
import xj.g;

@f(with = Serializer.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002$%B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bHÆ\u0003Jj\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser;", "", "id", "", "username", "isBot", "", "isFriend", "friendNickname", "globalName", "nicknames", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFriendNickname", "()Ljava/lang/String;", "getGlobalName", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNicknames", "()Ljava/util/Map;", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/discord/user_search_worker/UserSearchTransformedUser;", "equals", "other", "hashCode", "", "toString", "Companion", "Serializer", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserSearchTransformedUser {
    public static final Companion Companion = new Companion(null);
    private final String friendNickname;
    private final String globalName;

    /* renamed from: id  reason: collision with root package name */
    private final String f7964id;
    private final Boolean isBot;
    private final Boolean isFriend;
    private final Map<String, String> nicknames;
    private final String username;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchTransformedUser> serializer() {
            return Serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "()V", "TRANSFORMED_USER_KEYS", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Serializer implements KSerializer<UserSearchTransformedUser> {
        public static final Serializer INSTANCE = new Serializer();
        private static final Set<String> TRANSFORMED_USER_KEYS;

        static {
            Set<String> i10;
            i10 = w.i("id", "username", "isBot", "isFriend", "friendNickname", "globalName");
            TRANSFORMED_USER_KEYS = i10;
        }

        private Serializer() {
        }

        @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return g.a("UserSearchTransformedUser", e.i.f32135a);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public UserSearchTransformedUser deserialize(Decoder decoder) {
            String str;
            Map r10;
            String str2;
            JsonPrimitive n10;
            JsonPrimitive n11;
            JsonPrimitive n12;
            JsonPrimitive n13;
            q.g(decoder, "decoder");
            JsonElement g10 = ((kotlinx.serialization.json.e) decoder).g();
            q.e(g10, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            JsonObject jsonObject = (JsonObject) g10;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                JsonElement value = entry.getValue();
                if (!TRANSFORMED_USER_KEYS.contains(entry.getKey()) && (kotlinx.serialization.json.g.n(value).e() || (kotlinx.serialization.json.g.n(value) instanceof JsonNull))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str3 = (String) entry2.getKey();
                JsonElement jsonElement = (JsonElement) entry2.getValue();
                if (kotlinx.serialization.json.g.n(jsonElement).e()) {
                    str = kotlinx.serialization.json.g.n(jsonElement).b();
                }
                arrayList.add(x.a(str3, str));
            }
            r10 = v.r(arrayList);
            Object obj = jsonObject.get("id");
            q.d(obj);
            String b10 = kotlinx.serialization.json.g.n((JsonElement) obj).b();
            Object obj2 = jsonObject.get("username");
            q.d(obj2);
            String b11 = kotlinx.serialization.json.g.n((JsonElement) obj2).b();
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("isBot");
            Boolean valueOf = (jsonElement2 == null || (n13 = kotlinx.serialization.json.g.n(jsonElement2)) == null) ? null : Boolean.valueOf(kotlinx.serialization.json.g.f(n13));
            JsonElement jsonElement3 = (JsonElement) jsonObject.get("isFriend");
            Boolean valueOf2 = (jsonElement3 == null || (n12 = kotlinx.serialization.json.g.n(jsonElement3)) == null) ? null : Boolean.valueOf(kotlinx.serialization.json.g.f(n12));
            JsonElement jsonElement4 = (JsonElement) jsonObject.get("friendNickname");
            if (jsonElement4 == null || (n11 = kotlinx.serialization.json.g.n(jsonElement4)) == null) {
                str2 = null;
            } else {
                str2 = n11.e() ? n11.b() : null;
            }
            JsonElement jsonElement5 = (JsonElement) jsonObject.get("globalName");
            if (!(jsonElement5 == null || (n10 = kotlinx.serialization.json.g.n(jsonElement5)) == null || !n10.e())) {
                str = n10.b();
            }
            return new UserSearchTransformedUser(b10, b11, valueOf, valueOf2, str2, str, r10);
        }

        public void serialize(Encoder encoder, UserSearchTransformedUser value) {
            q.g(encoder, "encoder");
            q.g(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    public UserSearchTransformedUser(String id2, String username, Boolean bool, Boolean bool2, String str, String str2, Map<String, String> nicknames) {
        q.g(id2, "id");
        q.g(username, "username");
        q.g(nicknames, "nicknames");
        this.f7964id = id2;
        this.username = username;
        this.isBot = bool;
        this.isFriend = bool2;
        this.friendNickname = str;
        this.globalName = str2;
        this.nicknames = nicknames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSearchTransformedUser copy$default(UserSearchTransformedUser userSearchTransformedUser, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userSearchTransformedUser.f7964id;
        }
        if ((i10 & 2) != 0) {
            str2 = userSearchTransformedUser.username;
        }
        if ((i10 & 4) != 0) {
            bool = userSearchTransformedUser.isBot;
        }
        if ((i10 & 8) != 0) {
            bool2 = userSearchTransformedUser.isFriend;
        }
        if ((i10 & 16) != 0) {
            str3 = userSearchTransformedUser.friendNickname;
        }
        if ((i10 & 32) != 0) {
            str4 = userSearchTransformedUser.globalName;
        }
        if ((i10 & 64) != 0) {
            map = userSearchTransformedUser.nicknames;
        }
        return userSearchTransformedUser.copy(str, str2, bool, bool2, str3, str4, map);
    }

    public final String component1() {
        return this.f7964id;
    }

    public final String component2() {
        return this.username;
    }

    public final Boolean component3() {
        return this.isBot;
    }

    public final Boolean component4() {
        return this.isFriend;
    }

    public final String component5() {
        return this.friendNickname;
    }

    public final String component6() {
        return this.globalName;
    }

    public final Map<String, String> component7() {
        return this.nicknames;
    }

    public final UserSearchTransformedUser copy(String id2, String username, Boolean bool, Boolean bool2, String str, String str2, Map<String, String> nicknames) {
        q.g(id2, "id");
        q.g(username, "username");
        q.g(nicknames, "nicknames");
        return new UserSearchTransformedUser(id2, username, bool, bool2, str, str2, nicknames);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchTransformedUser)) {
            return false;
        }
        UserSearchTransformedUser userSearchTransformedUser = (UserSearchTransformedUser) obj;
        return q.b(this.f7964id, userSearchTransformedUser.f7964id) && q.b(this.username, userSearchTransformedUser.username) && q.b(this.isBot, userSearchTransformedUser.isBot) && q.b(this.isFriend, userSearchTransformedUser.isFriend) && q.b(this.friendNickname, userSearchTransformedUser.friendNickname) && q.b(this.globalName, userSearchTransformedUser.globalName) && q.b(this.nicknames, userSearchTransformedUser.nicknames);
    }

    public final String getFriendNickname() {
        return this.friendNickname;
    }

    public final String getGlobalName() {
        return this.globalName;
    }

    public final String getId() {
        return this.f7964id;
    }

    public final Map<String, String> getNicknames() {
        return this.nicknames;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((this.f7964id.hashCode() * 31) + this.username.hashCode()) * 31;
        Boolean bool = this.isBot;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFriend;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.friendNickname;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.globalName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.nicknames.hashCode();
    }

    public final Boolean isBot() {
        return this.isBot;
    }

    public final Boolean isFriend() {
        return this.isFriend;
    }

    public String toString() {
        String str = this.f7964id;
        String str2 = this.username;
        Boolean bool = this.isBot;
        Boolean bool2 = this.isFriend;
        String str3 = this.friendNickname;
        String str4 = this.globalName;
        Map<String, String> map = this.nicknames;
        return "UserSearchTransformedUser(id=" + str + ", username=" + str2 + ", isBot=" + bool + ", isFriend=" + bool2 + ", friendNickname=" + str3 + ", globalName=" + str4 + ", nicknames=" + map + ")";
    }

    public /* synthetic */ UserSearchTransformedUser(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, map);
    }
}
