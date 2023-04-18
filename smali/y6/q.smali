.class public final synthetic Ly6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Ly6/r;

.field public final synthetic b:Lq6/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ly6/r;Lq6/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/q;->a:Ly6/r;

    iput-object p2, p0, Ly6/q;->b:Lq6/o;

    iput-wide p3, p0, Ly6/q;->c:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ly6/q;->a:Ly6/r;

    iget-object v1, p0, Ly6/q;->b:Lq6/o;

    iget-wide v2, p0, Ly6/q;->c:J

    invoke-static {v0, v1, v2, v3}, Ly6/r;->f(Ly6/r;Lq6/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
