.class final Lrd/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lrd/o;

.field private final b:Z


# direct methods
.method constructor <init>(Lrd/o;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p2, p0, Lrd/l;->b:Z

    .line 4
    iput-object p1, p0, Lrd/l;->a:Lrd/o;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lrd/l;-><init>(Lrd/o;Z)V

    return-void
.end method


# virtual methods
.method a()Lrd/o;
    .locals 1

    iget-object v0, p0, Lrd/l;->a:Lrd/o;

    return-object v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lrd/l;->b:Z

    return v0
.end method
