.class public final synthetic Le7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/h;->a:Le7/e1$a;

    iput-boolean p2, p0, Le7/h;->b:Z

    iput p3, p0, Le7/h;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Le7/h;->a:Le7/e1$a;

    iget-boolean v1, p0, Le7/h;->b:Z

    iget v2, p0, Le7/h;->c:I

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, v2, p1}, Le7/d1;->x0(Le7/e1$a;ZILe7/e1;)V

    return-void
.end method
