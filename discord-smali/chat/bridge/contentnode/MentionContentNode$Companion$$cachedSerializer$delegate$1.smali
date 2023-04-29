.class final Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/contentnode/MentionContentNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlinx/serialization/KSerializer<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;

    invoke-direct {v0}, Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;-><init>()V

    sput-object v0, Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion$$cachedSerializer$delegate$1;->invoke()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlinx/serialization/KSerializer;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v6, Lkotlinx/serialization/SealedClassSerializer;

    const-string v1, "com.discord.chat.bridge.contentnode.MentionContentNode"

    const-class v0, Lcom/discord/chat/bridge/contentnode/MentionContentNode;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const/4 v0, 0x4

    new-array v3, v0, [Lkotlin/reflect/KClass;

    const-class v4, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-class v4, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;

    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    const/4 v7, 0x1

    aput-object v4, v3, v7

    const-class v4, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;

    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    const/4 v8, 0x2

    aput-object v4, v3, v8

    const-class v4, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    const/4 v9, 0x3

    aput-object v4, v3, v9

    new-array v4, v0, [Lkotlinx/serialization/KSerializer;

    sget-object v0, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode$$serializer;

    aput-object v0, v4, v5

    sget-object v0, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$$serializer;

    aput-object v0, v4, v7

    sget-object v0, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$$serializer;

    aput-object v0, v4, v8

    sget-object v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;

    aput-object v0, v4, v9

    new-array v5, v5, [Ljava/lang/annotation/Annotation;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lkotlinx/serialization/SealedClassSerializer;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method
