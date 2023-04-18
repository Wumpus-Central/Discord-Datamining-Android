.class public final Lcom/facebook/react/views/scroll/ReactScrollViewOverride;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/facebook/react/views/scroll/ReactScrollViewOverride;",
        "",
        "()V",
        "override",
        "",
        "flingVelocityLimit",
        "",
        "react_fork_overrides_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/views/scroll/ReactScrollViewOverride;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewOverride;

    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewOverride;-><init>()V

    sput-object v0, Lcom/facebook/react/views/scroll/ReactScrollViewOverride;->INSTANCE:Lcom/facebook/react/views/scroll/ReactScrollViewOverride;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic override$default(Lcom/facebook/react/views/scroll/ReactScrollViewOverride;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x30d4

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollViewOverride;->override(I)V

    return-void
.end method


# virtual methods
.method public final override(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sput-object p1, Lcom/facebook/react/views/scroll/ReactScrollView;->MAX_FLING_VELOCITY:Ljava/lang/Integer;

    return-void
.end method
