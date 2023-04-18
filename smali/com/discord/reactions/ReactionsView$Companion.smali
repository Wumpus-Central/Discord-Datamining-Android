.class public final Lcom/discord/reactions/ReactionsView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/reactions/ReactionsView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/reactions/ReactionsView$Companion;",
        "",
        "()V",
        "REACTION_HEIGHT",
        "",
        "sharedViewPool",
        "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
        "getSharedViewPool",
        "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
        "sharedViewPool$delegate",
        "Lkotlin/Lazy;",
        "reactions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/reactions/ReactionsView$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getSharedViewPool(Lcom/discord/reactions/ReactionsView$Companion;)Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;
    .locals 0

    invoke-direct {p0}, Lcom/discord/reactions/ReactionsView$Companion;->getSharedViewPool()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;

    move-result-object p0

    return-object p0
.end method

.method private final getSharedViewPool()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;
    .locals 1

    invoke-static {}, Lcom/discord/reactions/ReactionsView;->access$getSharedViewPool$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;

    return-object v0
.end method
