.class Llj/a$b;
.super Lgj/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final g:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lgj/p;-><init>()V

    .line 3
    iput p1, p0, Llj/a$b;->g:I

    return-void
.end method

.method synthetic constructor <init>(ILlj/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llj/a$b;-><init>(I)V

    return-void
.end method
