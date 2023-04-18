.class public final synthetic Ly6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Ly6/r;

.field public final synthetic b:Lq6/o;


# direct methods
.method public synthetic constructor <init>(Ly6/r;Lq6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/k;->a:Ly6/r;

    iput-object p2, p0, Ly6/k;->b:Lq6/o;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ly6/k;->a:Ly6/r;

    iget-object v1, p0, Ly6/k;->b:Lq6/o;

    invoke-static {v0, v1}, Ly6/r;->b(Ly6/r;Lq6/o;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
