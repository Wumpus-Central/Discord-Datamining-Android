.class public final Lqe/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lqe/f;",
        "",
        "a",
        "litr_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final a:Lqe/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqe/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqe/f;->a:Lqe/f$a;

    return-void
.end method

.method public static final a(Landroid/media/MediaFormat;Ljava/lang/Number;)Ljava/lang/Number;
    .locals 1

    sget-object v0, Lqe/f;->a:Lqe/f$a;

    invoke-virtual {v0, p0, p1}, Lqe/f$a;->b(Landroid/media/MediaFormat;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/media/MediaFormat;Ljava/lang/String;)Ljava/lang/Number;
    .locals 1

    sget-object v0, Lqe/f;->a:Lqe/f$a;

    invoke-virtual {v0, p0, p1}, Lqe/f$a;->c(Landroid/media/MediaFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method
