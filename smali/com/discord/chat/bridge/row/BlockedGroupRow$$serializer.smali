.class public final Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/row/BlockedGroupRow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/chat/bridge/row/BlockedGroupRow;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/chat/bridge/row/BlockedGroupRow.$serializer",
        "Lzi/f0;",
        "Lcom/discord/chat/bridge/row/BlockedGroupRow;",
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
.field public static final INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "2"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lzi/f0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "index"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "changeType"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "color"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "borderColor"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "backgroundColor"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "text"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "revealed"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "button"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "content"

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 65
    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    const/16 v0, 0x9

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
    const/4 v2, 0x1

    .line 11
    sget-object v3, Lcom/discord/chat/bridge/ChangeType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/ChangeType$Serializer;

    .line 12
    .line 13
    aput-object v3, v0, v2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    aput-object v1, v0, v2

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    aput-object v1, v0, v2

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 26
    .line 27
    aput-object v2, v0, v1

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    sget-object v2, Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;

    .line 36
    .line 37
    aput-object v2, v0, v1

    .line 38
    .line 39
    new-instance v1, Lzi/f;

    .line 40
    .line 41
    sget-object v2, Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;

    .line 42
    .line 43
    invoke-direct {v1, v2}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    return-object v0
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/BlockedGroupRow;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->y()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v11}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    sget-object v11, Lcom/discord/chat/bridge/ChangeType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/ChangeType$Serializer;

    invoke-interface {v0, v1, v10, v11, v12}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v9

    invoke-interface {v0, v1, v6}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v6

    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v8

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    sget-object v11, Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;

    invoke-interface {v0, v1, v3, v11, v12}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v11, Lzi/f;

    sget-object v13, Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;

    invoke-direct {v11, v13}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v7, v11, v12}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/16 v11, 0x1ff

    move v15, v4

    move-object v14, v5

    move v12, v6

    move v13, v8

    move v8, v11

    move v11, v9

    move v9, v2

    goto/16 :goto_3

    :cond_0
    move/from16 v20, v10

    move v2, v11

    move v13, v2

    move v14, v13

    move v15, v14

    move-object v9, v12

    move-object v10, v9

    move-object/from16 v16, v10

    move-object/from16 v17, v16

    move v12, v15

    :goto_0
    if-eqz v20, :cond_1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v6}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    new-instance v6, Lzi/f;

    sget-object v8, Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;

    invoke-direct {v6, v8}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v7, v6, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v11, v11, 0x100

    goto :goto_1

    :pswitch_1
    sget-object v6, Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;

    invoke-interface {v0, v1, v3, v6, v10}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v11, v11, 0x80

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v12

    or-int/lit8 v11, v11, 0x40

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v11, v11, 0x20

    :goto_1
    const/4 v6, 0x3

    const/4 v8, 0x4

    goto :goto_0

    :pswitch_4
    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v14

    or-int/lit8 v11, v11, 0x10

    const/4 v6, 0x3

    goto :goto_0

    :pswitch_5
    const/4 v6, 0x3

    invoke-interface {v0, v1, v6}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v13

    or-int/lit8 v11, v11, 0x8

    goto :goto_0

    :pswitch_6
    const/4 v6, 0x3

    const/4 v15, 0x2

    invoke-interface {v0, v1, v15}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v19

    or-int/lit8 v11, v11, 0x4

    move/from16 v15, v19

    goto :goto_0

    :pswitch_7
    const/4 v6, 0x3

    const/16 v19, 0x2

    sget-object v3, Lcom/discord/chat/bridge/ChangeType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/ChangeType$Serializer;

    move-object/from16 v4, v16

    const/4 v5, 0x1

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v11, v11, 0x2

    move-object/from16 v16, v3

    goto :goto_2

    :pswitch_8
    move-object/from16 v4, v16

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/16 v19, 0x2

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    or-int/lit8 v11, v11, 0x1

    :goto_2
    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    goto :goto_0

    :pswitch_9
    move-object/from16 v4, v16

    const/4 v3, 0x0

    const/4 v6, 0x3

    const/16 v19, 0x2

    move/from16 v20, v3

    const/4 v3, 0x7

    const/4 v4, 0x6

    goto :goto_0

    :cond_1
    move-object/from16 v4, v16

    move-object v7, v9

    move-object v3, v10

    move v8, v11

    move v11, v15

    move v9, v2

    move-object v10, v4

    move v15, v12

    move v12, v13

    move v13, v14

    move-object/from16 v14, v17

    :goto_3
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    check-cast v10, Lcom/discord/chat/bridge/ChangeType;

    move-object/from16 v16, v3

    check-cast v16, Lcom/discord/chat/bridge/row/BlockedGroupButton;

    move-object/from16 v17, v7

    check-cast v17, Ljava/util/List;

    const/16 v18, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v18}, Lcom/discord/chat/bridge/row/BlockedGroupRow;-><init>(IILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/BlockedGroupRow;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/BlockedGroupRow;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->write$Self(Lcom/discord/chat/bridge/row/BlockedGroupRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/BlockedGroupRow;)V

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
