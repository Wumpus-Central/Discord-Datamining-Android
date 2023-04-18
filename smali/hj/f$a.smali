.class final Lhj/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/t<",
        "Lfj/o;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfj/o;)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/o;

    invoke-virtual {p0, p1}, Lhj/f$a;->a(Lfj/o;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
