.class Lbc/g$h;
.super Lbc/g$l;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/g<",
        "TK;TV;>.l;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>(Lbc/g;Ljava/lang/Object;Ljava/util/List;Lbc/g$k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Lbc/g<",
            "TK;TV;>.k;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lbc/g$l;-><init>(Lbc/g;Ljava/lang/Object;Ljava/util/List;Lbc/g$k;)V

    return-void
.end method
