.class Lbc/y;
.super Lbc/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/j0<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static final q:Lbc/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbc/y;

    invoke-direct {v0}, Lbc/y;-><init>()V

    sput-object v0, Lbc/y;->q:Lbc/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, Lbc/l0;->r()Lbc/l0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lbc/j0;-><init>(Lbc/l0;I)V

    return-void
.end method
