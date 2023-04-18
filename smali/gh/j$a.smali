.class final Lgh/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnh/j$b<",
        "Lgh/j;",
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

    invoke-virtual {p0, p1}, Lgh/j$a;->b(I)Lgh/j;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lgh/j;
    .locals 0

    invoke-static {p1}, Lgh/j;->a(I)Lgh/j;

    move-result-object p1

    return-object p1
.end method
