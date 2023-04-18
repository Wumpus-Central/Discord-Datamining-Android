.class Lhj/l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/n<",
        "Ljava/lang/Character;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lhj/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhj/l$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Character;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    const/16 v0, 0x54

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p0, p1}, Lhj/l$d;->a(Ljava/lang/Character;)Z

    move-result p1

    return p1
.end method
