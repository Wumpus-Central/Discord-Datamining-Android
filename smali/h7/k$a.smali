.class Lh7/k$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/k;-><init>([Lh7/h;[Lh7/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lh7/k;


# direct methods
.method constructor <init>(Lh7/k;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh7/k$a;->k:Lh7/k;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lh7/k$a;->k:Lh7/k;

    invoke-static {v0}, Lh7/k;->e(Lh7/k;)V

    return-void
.end method
