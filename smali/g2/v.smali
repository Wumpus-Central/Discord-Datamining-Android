.class public final synthetic Lg2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/e0$b;


# instance fields
.field public final synthetic a:Lg2/e0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lg2/e0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/v;->a:Lg2/e0;

    iput p2, p0, Lg2/v;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lg2/i;)V
    .locals 2

    iget-object v0, p0, Lg2/v;->a:Lg2/e0;

    iget v1, p0, Lg2/v;->b:I

    invoke-static {v0, v1, p1}, Lg2/e0;->h(Lg2/e0;ILg2/i;)V

    return-void
.end method
