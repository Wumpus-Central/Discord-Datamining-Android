.class Lgj/p$c;
.super Lgj/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final g:Lgj/k;

.field private final h:Z


# direct methods
.method private constructor <init>(Lgj/k;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lgj/p;-><init>()V

    .line 3
    iput-object p1, p0, Lgj/p$c;->g:Lgj/k;

    .line 4
    iput-boolean p2, p0, Lgj/p$c;->h:Z

    return-void
.end method

.method synthetic constructor <init>(Lgj/k;ZLgj/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgj/p$c;-><init>(Lgj/k;Z)V

    return-void
.end method
