.class public final synthetic Lx6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Lx6/c;

.field public final synthetic b:Lq6/o;

.field public final synthetic c:Lq6/i;


# direct methods
.method public synthetic constructor <init>(Lx6/c;Lq6/o;Lq6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/b;->a:Lx6/c;

    iput-object p2, p0, Lx6/b;->b:Lq6/o;

    iput-object p3, p0, Lx6/b;->c:Lq6/i;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx6/b;->a:Lx6/c;

    iget-object v1, p0, Lx6/b;->b:Lq6/o;

    iget-object v2, p0, Lx6/b;->c:Lq6/i;

    invoke-static {v0, v1, v2}, Lx6/c;->c(Lx6/c;Lq6/o;Lq6/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
