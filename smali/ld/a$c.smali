.class final Lld/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lld/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Comparator<",
        "Lld/a$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lld/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lld/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lld/a$b;Lld/a$b;)I
    .locals 0

    invoke-virtual {p1}, Lld/a$b;->c()I

    move-result p1

    invoke-virtual {p2}, Lld/a$b;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lld/a$b;

    check-cast p2, Lld/a$b;

    invoke-virtual {p0, p1, p2}, Lld/a$c;->a(Lld/a$b;Lld/a$b;)I

    move-result p1

    return p1
.end method
