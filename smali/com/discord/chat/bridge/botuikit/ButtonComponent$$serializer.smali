.class public final Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/botuikit/ButtonComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/chat/bridge/botuikit/ButtonComponent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/chat/bridge/botuikit/ButtonComponent.$serializer",
        "Lzi/f0;",
        "Lcom/discord/chat/bridge/botuikit/ButtonComponent;",
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
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "2"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lzi/f0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "type"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "indices"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "applicationId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "customId"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "label"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "style"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "disabled"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "emoji"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "url"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "state"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    sput-object v1, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 70
    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
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
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    sget-object v1, Lzi/m0;->a:Lzi/m0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    new-instance v2, Lzi/f;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput-object v2, v0, v1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    sget-object v2, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    .line 20
    .line 21
    aput-object v2, v0, v1

    .line 22
    .line 23
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 24
    .line 25
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x3

    .line 30
    aput-object v2, v0, v3

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    aput-object v3, v0, v2

    .line 38
    .line 39
    const/4 v2, 0x5

    .line 40
    sget-object v3, Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;

    .line 41
    .line 42
    aput-object v3, v0, v2

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    sget-object v3, Lzi/h;->a:Lzi/h;

    .line 46
    .line 47
    aput-object v3, v0, v2

    .line 48
    .line 49
    sget-object v2, Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;

    .line 50
    .line 51
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, 0x7

    .line 56
    aput-object v2, v0, v3

    .line 57
    .line 58
    const/16 v2, 0x8

    .line 59
    .line 60
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    const/16 v1, 0x9

    .line 67
    .line 68
    sget-object v2, Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;

    .line 69
    .line 70
    aput-object v2, v0, v1

    .line 71
    .line 72
    return-object v0
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->y()Z

    move-result v2

    const/16 v3, 0x9

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v12}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    new-instance v12, Lzi/f;

    sget-object v14, Lzi/m0;->a:Lzi/m0;

    invoke-direct {v12, v14}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v11, v12, v13}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    invoke-interface {v0, v1, v10, v12, v13}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v7, v12, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v1, v9, v12, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    sget-object v14, Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;

    invoke-interface {v0, v1, v6, v14, v13}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v5

    sget-object v14, Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;

    invoke-interface {v0, v1, v4, v14, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v8, v12, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    sget-object v12, Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;

    invoke-interface {v0, v1, v3, v12, v13}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v12, 0x3ff

    move v13, v5

    move-object v15, v11

    move-object v11, v7

    move v7, v2

    move-object v2, v6

    move v6, v12

    goto/16 :goto_4

    :cond_0
    move/from16 v19, v11

    move v2, v12

    move v14, v2

    move-object v5, v13

    move-object v6, v5

    move-object v7, v6

    move-object v9, v7

    move-object v10, v9

    move-object v11, v10

    move-object v15, v11

    move-object v12, v15

    move v13, v14

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v4}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v4, Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;

    invoke-interface {v0, v1, v3, v4, v5}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit16 v14, v14, 0x200

    goto :goto_1

    :pswitch_1
    sget-object v4, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v8, v4, v6}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit16 v14, v14, 0x100

    :goto_1
    const/4 v4, 0x7

    goto :goto_0

    :pswitch_2
    sget-object v4, Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v4, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v14, v14, 0x80

    goto :goto_2

    :pswitch_3
    const/4 v3, 0x7

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v13

    or-int/lit8 v14, v14, 0x40

    :goto_2
    move v4, v3

    const/16 v3, 0x9

    goto :goto_0

    :pswitch_4
    const/4 v4, 0x6

    sget-object v3, Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;

    const/4 v8, 0x5

    invoke-interface {v0, v1, v8, v3, v7}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    or-int/lit8 v14, v14, 0x20

    goto :goto_3

    :pswitch_5
    const/4 v4, 0x6

    const/4 v8, 0x5

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    const/4 v8, 0x4

    invoke-interface {v0, v1, v8, v3, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit8 v14, v14, 0x10

    goto :goto_3

    :pswitch_6
    const/4 v4, 0x6

    const/4 v8, 0x4

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    const/4 v8, 0x3

    invoke-interface {v0, v1, v8, v3, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v14, v14, 0x8

    goto :goto_3

    :pswitch_7
    const/4 v4, 0x6

    const/4 v8, 0x3

    sget-object v3, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    const/4 v8, 0x2

    invoke-interface {v0, v1, v8, v3, v12}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v14, v14, 0x4

    goto :goto_3

    :pswitch_8
    const/4 v4, 0x6

    const/4 v8, 0x2

    new-instance v3, Lzi/f;

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v15}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v14, v14, 0x2

    goto :goto_3

    :pswitch_9
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v8, 0x2

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    or-int/lit8 v14, v14, 0x1

    goto :goto_3

    :pswitch_a
    const/4 v3, 0x0

    const/4 v8, 0x2

    move/from16 v19, v3

    :goto_3
    const/16 v3, 0x9

    const/4 v4, 0x7

    const/16 v8, 0x8

    goto/16 :goto_0

    :cond_1
    move-object v3, v5

    move-object v8, v6

    move-object v4, v9

    move-object v9, v10

    move-object v10, v12

    move v6, v14

    move-object/from16 v20, v7

    move v7, v2

    move-object/from16 v2, v20

    :goto_4
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    move-object v1, v15

    check-cast v1, Ljava/util/List;

    check-cast v10, Lcom/discord/primitives/ApplicationId;

    check-cast v11, Ljava/lang/String;

    move-object v12, v9

    check-cast v12, Ljava/lang/String;

    check-cast v2, Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    move-object v14, v4

    check-cast v14, Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-object v15, v8

    check-cast v15, Ljava/lang/String;

    move-object/from16 v16, v3

    check-cast v16, Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v5, v0

    move-object v8, v1

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v2

    invoke-direct/range {v5 .. v18}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;-><init>(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
    invoke-virtual {p0, p1}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ButtonComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->write$Self(Lcom/discord/chat/bridge/botuikit/ButtonComponent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ButtonComponent;)V

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
