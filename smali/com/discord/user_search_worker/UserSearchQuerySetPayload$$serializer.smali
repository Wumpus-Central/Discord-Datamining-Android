.class public final Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/user_search_worker/UserSearchQuerySetPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/user_search_worker/UserSearchQuerySetPayload.$serializer",
        "Lzi/f0;",
        "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "getDescriptor",
        "()Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "descriptor",
        "<init>",
        "()V",
        "user_search_worker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.discord.user_search_worker.UserSearchQuerySetPayload"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lzi/f0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "query"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "filters"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "blacklist"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "whitelist"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "boosters"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "limit"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    sput-object v1, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 3
    .line 4
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v2, Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;

    .line 10
    .line 11
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object v2, v0, v3

    .line 17
    .line 18
    new-instance v2, Lzi/f;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x2

    .line 28
    aput-object v2, v0, v3

    .line 29
    .line 30
    new-instance v2, Lzi/f;

    .line 31
    .line 32
    invoke-direct {v2, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x3

    .line 40
    aput-object v2, v0, v3

    .line 41
    .line 42
    new-instance v2, Lzi/r0;

    .line 43
    .line 44
    sget-object v3, Lzi/x;->a:Lzi/x;

    .line 45
    .line 46
    invoke-direct {v2, v1, v3}, Lzi/r0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    aput-object v2, v0, v1

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    sget-object v2, Lzi/m0;->a:Lzi/m0;

    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    return-object v0
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/user_search_worker/UserSearchQuerySetPayload;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->y()Z

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;

    invoke-interface {v0, v1, v7, v8, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    new-instance v8, Lzi/f;

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    invoke-direct {v8, v10}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v6, v8, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    new-instance v8, Lzi/f;

    invoke-direct {v8, v10}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v4, v8, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v8, Lzi/r0;

    sget-object v11, Lzi/x;->a:Lzi/x;

    invoke-direct {v8, v10, v11}, Lzi/r0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v5, v8, v9}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v3

    const/16 v8, 0x3f

    move-object v11, v2

    move/from16 v16, v3

    move v10, v8

    goto/16 :goto_4

    :cond_0
    move v15, v7

    move v2, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move v9, v2

    :goto_0
    if-eqz v15, :cond_1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v8}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    or-int/lit8 v9, v9, 0x20

    goto :goto_2

    :pswitch_1
    new-instance v8, Lzi/r0;

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    sget-object v7, Lzi/x;->a:Lzi/x;

    invoke-direct {v8, v3, v7}, Lzi/r0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v5, v8, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit8 v9, v9, 0x10

    goto :goto_1

    :pswitch_2
    new-instance v3, Lzi/f;

    sget-object v7, Lzi/a2;->a:Lzi/a2;

    invoke-direct {v3, v7}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v4, v3, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v9, v9, 0x8

    goto :goto_1

    :pswitch_3
    new-instance v3, Lzi/f;

    sget-object v7, Lzi/a2;->a:Lzi/a2;

    invoke-direct {v3, v7}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v6, v3, v12}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v9, v9, 0x4

    :goto_1
    const/4 v3, 0x5

    const/4 v7, 0x1

    goto :goto_2

    :pswitch_4
    sget-object v3, Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetFilters$$serializer;

    const/4 v7, 0x1

    invoke-interface {v0, v1, v7, v3, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v9, v9, 0x2

    const/4 v3, 0x5

    :goto_2
    const/4 v8, 0x0

    goto :goto_0

    :pswitch_5
    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v9, v9, 0x1

    move v8, v3

    goto :goto_3

    :pswitch_6
    const/4 v3, 0x0

    move v8, v3

    move v15, v8

    :goto_3
    const/4 v3, 0x5

    goto :goto_0

    :cond_1
    move/from16 v16, v2

    move-object v7, v11

    move-object v6, v12

    move-object v4, v13

    move-object v5, v14

    move-object v11, v10

    move v10, v9

    :goto_4
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    move-object v12, v7

    check-cast v12, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;

    move-object v13, v6

    check-cast v13, Ljava/util/List;

    move-object v14, v4

    check-cast v14, Ljava/util/List;

    move-object v15, v5

    check-cast v15, Ljava/util/Map;

    const/16 v17, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v17}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;-><init>(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->write$Self(Lcom/discord/user_search_worker/UserSearchQuerySetPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    invoke-virtual {p0, p1, p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V

    return-void
.end method

.method public typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, Lzi/f0$a;->a(Lzi/f0;)[Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method