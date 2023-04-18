.class public final synthetic Ly6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Ly6/r;

.field public final synthetic b:Lq6/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ly6/r;Lq6/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/j;->a:Ly6/r;

    iput-object p2, p0, Ly6/j;->b:Lq6/o;

    iput p3, p0, Ly6/j;->c:I

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly6/j;->a:Ly6/r;

    iget-object v1, p0, Ly6/j;->b:Lq6/o;

    iget v2, p0, Ly6/j;->c:I

    invoke-static {v0, v1, v2}, Ly6/r;->h(Ly6/r;Lq6/o;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
