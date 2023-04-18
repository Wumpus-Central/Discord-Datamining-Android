.class final Lgh/s$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/s$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnh/j$b<",
        "Lgh/s$c;",
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
.method public bridge synthetic a(I)Lnh/j$a;
    .locals 0

    invoke-virtual {p0, p1}, Lgh/s$c$a;->b(I)Lgh/s$c;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lgh/s$c;
    .locals 0

    invoke-static {p1}, Lgh/s$c;->a(I)Lgh/s$c;

    move-result-object p1

    return-object p1
.end method
