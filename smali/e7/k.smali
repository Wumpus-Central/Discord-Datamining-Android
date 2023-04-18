.class public final synthetic Le7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Ld7/k;

.field public final synthetic c:Lh7/i;


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Ld7/k;Lh7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/k;->a:Le7/e1$a;

    iput-object p2, p0, Le7/k;->b:Ld7/k;

    iput-object p3, p0, Le7/k;->c:Lh7/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Le7/k;->a:Le7/e1$a;

    iget-object v1, p0, Le7/k;->b:Ld7/k;

    iget-object v2, p0, Le7/k;->c:Lh7/i;

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, v2, p1}, Le7/d1;->q0(Le7/e1$a;Ld7/k;Lh7/i;Le7/e1;)V

    return-void
.end method
