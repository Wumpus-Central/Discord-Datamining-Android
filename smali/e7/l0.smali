.class public final synthetic Le7/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/l0;->a:Le7/e1$a;

    iput p2, p0, Le7/l0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le7/l0;->a:Le7/e1$a;

    iget v1, p0, Le7/l0;->b:I

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, p1}, Le7/d1;->f0(Le7/e1$a;ILe7/e1;)V

    return-void
.end method
