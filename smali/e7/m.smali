.class public final synthetic Le7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/m;->a:Le7/e1$a;

    iput-object p2, p0, Le7/m;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le7/m;->a:Le7/e1$a;

    iget-object v1, p0, Le7/m;->b:Landroid/view/Surface;

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, p1}, Le7/d1;->z0(Le7/e1$a;Landroid/view/Surface;Le7/e1;)V

    return-void
.end method
