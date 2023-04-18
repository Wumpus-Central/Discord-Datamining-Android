.class public Lce/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/j;


# instance fields
.field private final a:Lbe/e;


# direct methods
.method public constructor <init>(Lbe/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce/a;->a:Lbe/e;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic b(Lce/a;)Lbe/e;
    .locals 0

    iget-object p0, p0, Lce/a;->a:Lbe/e;

    return-object p0
.end method


# virtual methods
.method public a(Lde/g;)V
    .locals 2

    iget-object v0, p1, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    new-instance v1, Lce/a$a;

    invoke-direct {v1, p0, p1}, Lce/a$a;-><init>(Lce/a;Lde/g;)V

    invoke-interface {v0, v1}, Lcom/henninghall/date_picker/pickers/a;->setOnValueChangedListener(Lcom/henninghall/date_picker/pickers/a$a;)V

    return-void
.end method
