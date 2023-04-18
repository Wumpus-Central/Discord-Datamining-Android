.class public final synthetic Li0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k2$c;


# instance fields
.field public final synthetic a:Li0/c1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lj0/a;

.field public final synthetic d:Landroid/util/Size;


# direct methods
.method public synthetic constructor <init>(Li0/c1;Ljava/lang/String;Lj0/a;Landroid/util/Size;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/b1;->a:Li0/c1;

    iput-object p2, p0, Li0/b1;->b:Ljava/lang/String;

    iput-object p3, p0, Li0/b1;->c:Lj0/a;

    iput-object p4, p0, Li0/b1;->d:Landroid/util/Size;

    return-void
.end method


# virtual methods
.method public final a(Lw/k2;Lw/k2$e;)V
    .locals 6

    iget-object v0, p0, Li0/b1;->a:Li0/c1;

    iget-object v1, p0, Li0/b1;->b:Ljava/lang/String;

    iget-object v2, p0, Li0/b1;->c:Lj0/a;

    iget-object v3, p0, Li0/b1;->d:Landroid/util/Size;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Li0/c1;->K(Li0/c1;Ljava/lang/String;Lj0/a;Landroid/util/Size;Lw/k2;Lw/k2$e;)V

    return-void
.end method
