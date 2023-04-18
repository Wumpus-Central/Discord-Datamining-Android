.class public final synthetic Le7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/h0;->a:Le7/e1$a;

    iput p2, p0, Le7/h0;->b:I

    iput p3, p0, Le7/h0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Le7/h0;->a:Le7/e1$a;

    iget v1, p0, Le7/h0;->b:I

    iget v2, p0, Le7/h0;->c:I

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, v2, p1}, Le7/d1;->R(Le7/e1$a;IILe7/e1;)V

    return-void
.end method
