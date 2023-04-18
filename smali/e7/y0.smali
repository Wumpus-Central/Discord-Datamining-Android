.class public final synthetic Le7/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/y0;->a:Le7/e1$a;

    iput p2, p0, Le7/y0;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le7/y0;->a:Le7/e1$a;

    iget v1, p0, Le7/y0;->b:F

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, p1}, Le7/d1;->w0(Le7/e1$a;FLe7/e1;)V

    return-void
.end method
