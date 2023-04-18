.class public final synthetic Lg2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/e0$b;


# instance fields
.field public final synthetic a:Lg2/e0;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lg2/e0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/t;->a:Lg2/e0;

    iput p2, p0, Lg2/t;->b:I

    iput p3, p0, Lg2/t;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lg2/i;)V
    .locals 3

    iget-object v0, p0, Lg2/t;->a:Lg2/e0;

    iget v1, p0, Lg2/t;->b:I

    iget v2, p0, Lg2/t;->c:I

    invoke-static {v0, v1, v2, p1}, Lg2/e0;->g(Lg2/e0;IILg2/i;)V

    return-void
.end method
