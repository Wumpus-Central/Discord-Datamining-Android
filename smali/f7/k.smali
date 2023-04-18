.class public final synthetic Lf7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/k;->k:Lf7/r$a;

    iput-wide p2, p0, Lf7/k;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf7/k;->k:Lf7/r$a;

    iget-wide v1, p0, Lf7/k;->l:J

    invoke-static {v0, v1, v2}, Lf7/r$a;->g(Lf7/r$a;J)V

    return-void
.end method
